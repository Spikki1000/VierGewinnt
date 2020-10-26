import java.util.Scanner;
/**
 * Die Klasse Spielfeld stellt das Spielfeld für 4-Gewinnt zur Verfügung. In einem 2D-Array werden die Steine der Spieler gespeichert und nach jedem Zug überprüft, ob es einen Sieger gibt. 
 * Ist dies der Fall, wird der Sieger bekannt gegeben. Vor einem Spielzug wird immer das gesamte Feld zur Übersicht ausgegeben.
 * Das 2D-Array hat die Dimensionen 7 und 6 wobei es 7 Spalten und 6 Zeilen sind.
 * 
 * @author Henning Ainödhofer
 * @version 25.10.2020
 */
public class Spielfeld
{
    private Stein [][] Spielfeld;

    public Spielfeld()
    {
        this.Spielfeld = new Stein [7][6];
        neuesSpielfeldErzeugen();
        ausgeben();
    }

    /**
     * Diese Methode stellt das Setzen eines Spielsteins dar. Bei falschen Eingaben wird der Spieler aufgefordert eine andere richtige Eingabe
     * zu machen.
     */
    public void setzeStein (Stein stein, String Spielername)
    {
        Scanner Spalte = new Scanner(System.in);
        System.out.println(Spielername+", bitte gib die Spalte an in der Sie ihren Stein werfen wollen!");
        int Eingabe = Spalte.nextInt();
        //Abfrage der möglichen Fehlerquellen
        while (Eingabe > 7 || Eingabe == 0 || Spielfeld[Eingabe-1][0].gibZeichen().equalsIgnoreCase("X") || Spielfeld[Eingabe-1][0].gibZeichen().equalsIgnoreCase("O"))
        {
            System.out.println ("Die Eingabe war Fehlerhaft, bitte Wiederholen Sie ihren Zug!"); 
            Eingabe = Spalte.nextInt();
        }
        int Zeile = 0;
        while(Zeile < Spielfeld[0].length && Spielfeld[Eingabe-1][Zeile] == null)
        {
            //erste belegte Zelle suchen
            Zeile = Zeile + 1;
        }
        Zeile = Zeile - 1; // Wieder auf das leere Feld springen
        Spielfeld [Eingabe-1][Zeile] = stein;               
    }

    /**
     * Diese Methode gibt dann true zurück, wenn es vier gleiche Symbole der Reihe gibt. Die Logik, wer dann gewonnen hat, wird in der
     * Klasse VierGewinnt realisiert.
     */
    public boolean pruefeGewonnen ()
    {
        if (pruefeVierInEinerSpalte()) return true;
        else if (pruefeVierInEinerZeile ()) return true;
        else if (pruefeVierDiagonalLR ()) return true;
        else if (pruefeVierDiagonalRL ()) return true;
        return false;
    }

    /**
     * Diese Methode überprüft, ob es vertikal zu einer Viererreihe gekommen ist. Dazu muss das gesamte Array durchlaufen werden.
     */
    private boolean pruefeVierInEinerSpalte ()
    {
        boolean erg = false;
        return erg;
    }       

    /**
     * Diese Methode überprüft, ob es horizontal zu einer Viererreihe gekommen ist. Dazu muss das gesamte Array durchlaufen werden.
     */
    private boolean pruefeVierInEinerZeile ()
    {
        boolean erg = false;
        return erg;
    }

    /**
     * Diese Methode überprüft, ob es Diagonal von Links nach Rechts zu einer Viererreihe gekommen ist. Dazu muss das gesamte Array durchlaufen werden,
     * allerdings kommen in der näheren Betrachtung nur wenige Diagonale in Frage, beispielsweise am Rand gar keine Viererreihen
     * entstehen können.
     */
    private boolean pruefeVierDiagonalLR ()
    {
        boolean erg = false;
        return erg;
    }

    /**
     * Diese Methode überprüft, ob es Diagonal von Rechts nach Links zu einer Viererreihe gekommen ist. Dazu muss das gesamte Array durchlaufen werden,
     * allerdings kommen in der näheren Betrachtung nur wenige Diagonale in Frage, beispielsweise am Rand gar keine Viererreihen
     * entstehen können.
     */
    private boolean pruefeVierDiagonalRL ()
    {
        boolean erg = false;
        return erg;
    }

    /**
     * Diese Methode soll das Spielfeld so ausgeben, dass es für die Spieler gut bespielbar ist. Für ein leeres Feld soll das @-Zeichen ausgegeben werden.
     */
    public void ausgeben()
    {
        
    }

    /**
     * Diese Methode soll das Spielfeld am Ende des Spiels ausgeben. Der Name des Spielers der gewonnen hat muss ebenfalls
     * ausgegeben werden.
     */
    public void ausgabeGewonnen (String Spieler)
    {
        
    }

    /**
     * Diese Methode soll allen Zellen auf dem Spielfeld das @-Zeichen zuweisen, damit man erkennen kann, welche 
     * Felder schon belget sind, und welche nicht.
     */
    public void neuesSpielfeldErzeugen ()
    { 
        
    }

    public Stein [][] gibSpielfeld()
    {
        return this.Spielfeld;
    }
}
