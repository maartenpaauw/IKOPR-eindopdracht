package MVCStudenten;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public class Student {
    // string voor studentnummer
    private String stNummer;
    // string voor student naam
    private String name;

    // methode verkrijgen van studentnummer
    public String getStNummer() {
        // teruggeven van studentnummer
        return stNummer;
    }

    // methode voor het setten van studentnummer
    public void setStNummer(String stNummer) {
        // setten van studentnummer
        this.stNummer = stNummer;
    }

    // methode verkrijgen studentnaam
    public String getName() {
        // teruggeven van studentnaam
        return name;
    }

    // methode voor het setten van studentnaam
    public void setName(String name) {
        // setten van studentnaam
        this.name = name;
    }
}
