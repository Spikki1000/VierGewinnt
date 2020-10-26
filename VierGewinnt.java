import java.util.Scanner;

/**
 * Diese Kasse kümmert sich mit ihrer Methode spielStarten() um die Spiellogik. Zu der Klasse gehören ein Spielfeld und zwei Spieler!
 * @author Henning Ainödhofer
 * @version 25.10.2020
 */
public class VierGewinnt
{
    /**
     * Objekt vom Typ Spielfeld
     */
    private Spielfeld VGSF;
    
    /**
     * Objekte vom Typ Spieler
     */
    private Spieler VGS2;
    private Spieler VGS1;
    
    /**
     * Da die Benutzereingaben erst mit Spielstart relevant werden, ist der Konstruktor leer, obwohl man schon hier
     * eigentlich die benötigten Objekte Spielfeld und Spieler erzeugen könnte.
     */
    public VierGewinnt()
    {
        
    }
    
    /**
     * Diese Methode stellt die Spielschleife dar, in der die Aktionen der Spieler abgefragt und umgesetzt werden.
     */
    public void spielStarten()
    {
        //Erzeugen und Setzen der Objekte
        
        System.out.println("Das Spiel beginnt!");
        Scanner Eingaben = new Scanner(System.in);
        System.out.println("Geben Sie den Namen für Spieler 1 ein");
        String nameSpieler1 = Eingaben.next();
        System.out.println("Geben Sie das Zeichen für Spieler 1 ein (X oder O)");
        String zeichenSpieler1 = Eingaben.next();
        
        System.out.println("Geben Sie den Namen für Spieler 2 ein");
        String nameSpieler2 = Eingaben.next();
        System.out.println("Geben Sie das Zeichen für Spieler 2 ein (X oder O)");
        String zeichenSpieler2 = Eingaben.next();
        
        // Es wird das Spielfeld erzeugt.
        VGSF = new Spielfeld ();
        
        //Es werden zwei Spieler erstellt, die jewels einen Verweis auf das Spielfeld bekommen.
        VGS1 = new Spieler (nameSpieler1, zeichenSpieler1, VGSF);
        VGS2 = new Spieler (nameSpieler2, zeichenSpieler2, VGSF);
        
        //Spielschleife
        int spielrunden = 21;
        for (int lds = spielrunden; lds > 0; lds--)
        {
            System.out.print("\f"); //Konsole wird gelöscht
            VGSF.ausgeben();
            VGS1.spielzug(lds); //Spielzug Spieler 1
            if (VGSF.pruefeGewonnen() == true) //Hat Spieler 1 gewonnen?
            {
                VGSF.ausgabeGewonnen(VGS1.gibName());
                break;
            }
            else
                VGSF.ausgeben();
            System.out.print("\f");
            VGSF.ausgeben();
            VGS2.spielzug (lds); //Spielzug Spieler 2
            if (VGSF.pruefeGewonnen() == true) //Hat Spieler 2 gewonnen?
            {
                VGSF.ausgabeGewonnen(VGS2.gibName());
                break;
            }
            System.out.print("\f");
            VGSF.ausgeben();
            spielrunden = spielrunden - 1;
        }
        if (spielrunden <= 0)
        {
            System.out.println("Das Spiel zwischen "+VGS1.gibName()+" und "+VGS2.gibName()+" endete Unentschieden!"); 
        }
    }
}