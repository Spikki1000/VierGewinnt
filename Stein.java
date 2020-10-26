
/**
 * Die Klasse Stein beschreibt ein Steinobjekt des Spiels 4-Gewinnt. Das Objekt wird durch ein eindeutiges Zeichen gekennzeichnet.
 * 
 * @author Henning Ainödhofer
 * @version 25.10.2020
 */
public class Stein
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String zeichen;

    /**
     * Konstruktor für Objekte der Klasse Stein
     */
    public Stein(String zeichen)
    {
        // Instanzvariable initialisieren
        this.zeichen = zeichen;
    }

    /**
     * Diese Methode gibt den Attributwert von zeichen zurück.
     * 
     * @return zeichen
     */
    public String gibZeichen()
    {
        return zeichen;
    }
}
