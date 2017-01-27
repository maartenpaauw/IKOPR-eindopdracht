package ObserverPattern;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public class MijnPostSubscriber implements Observer {

    // string voor naam
    private String naam;
    // string voor onderwerp
    private Subject onderwerp;

    // constructor post subscriber
    public MijnPostSubscriber(String naam) {
        // setten naam
        this.naam = naam;
    }

    @Override
    // update methode overschrijven
    public void update() {
        // string voor bericht
        String bericht = (String) onderwerp.getUpdate(this);
        // check of het bericht leeg is
        if (bericht == null) {
            // printen als het geen nieuw bericht is
            System.out.println(naam + ":: Geen Nieuw Bericht");
        } else
            // nieuwe bericht printen
            System.out.println(naam + ":: Nieuwe bericht::" + bericht);
    }

    @Override
    // onderwerp methode overshcijrven
    public void setOnderwerp(Subject onderwerp) {
        // onderwerp setten
        this.onderwerp = onderwerp;
    }

}
