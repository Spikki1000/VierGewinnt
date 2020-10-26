
/**
 * Die Klasse Spieler stellt einen Spieler im 4-Gewinnt Spiel dar. Der Spieler besitzt zu Beginn 21 Steine mit einem bestimmten zeichen. 
 * Der Einfachheit halber wird hier ein Zeichen und keine Farbe vewendet.
 * 
 * @author Henning Ainödhofer
 * @version 25.10.2020
 */
public class Spieler
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private Stein [] steine;
    private Spielfeld spielfeld;
    private int aktStein;

    /**
     * Konstruktor für Objekte der Klasse Spieler
     * @param name
     * @param zeichen
     * @param spielfeld
     */
    public Spieler(String name, String zeichen, Spielfeld spielfeld)
    {
        // Instanzvariable initialisieren
        this.name = name;
        this.steine = new Stein[21];
        for(int i = 0; i < steine.length; i++)
        {
            steine[i] = new Stein(zeichen);
        }
        this.spielfeld = spielfeld;
        this.aktStein = 0;
    }

    /**
     * Diese Methode setzt einen Spielstein
     * @param lds
     */
    public void spielzug (int lds)
    {
        System.out.println(name+" ist am Zug!");
        System.out.println(name+", Sie haben noch "+(lds)+" Steine!");
        spielfeld.setzeStein (steine[aktStein], name);
        aktStein = aktStein + 1;
    }    
    
    /**
     * Diese Methode gibt den Wert des Attributes name zurück
     * 
     * @return name
     */
    public String gibName()
    {
        return this.name;
    }
}
