package ObserverPattern;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

import java.util.ArrayList;
import java.util.List;

public class MijnPost implements Subject {

    // observer lijst
    private List<Observer> observers;
    // aanmaken bericht
    private String bericht;
    // aanmaken state als het veranderd is
    private boolean veranderd;
    // object aan maken van onderwerp
    private final Object ONDERWERP = new Object();

    // constructor mijnpost
    public MijnPost() {
        // instantieren arraylist
        this.observers = new ArrayList<>();
    }

    @Override
    // registreren observer
    public void register(Observer obj) {
        // toevoegen observer
        observers.add(obj);
    }

    @Override
    // uitschrijven observer
    public void unregister(Observer obj) {
        // verwijderen observer
        observers.remove(obj);
    }

    @Override
    // notificatie observers
    public void notifyObservers() {
        // nieuwe tijdelijke arraylist van observers
        List<Observer> tijdelijkeObservers = null;

        // check of die veranderd is
        if (!veranderd)
            return;
        // vullen meet observers
        tijdelijkeObservers = new ArrayList<>(this.observers);
        // veranderd op false zetten
        this.veranderd = false;

        // loopen door tijdelijkeObservers
        for (Observer obj : tijdelijkeObservers) {
            // elke observer updaten
            obj.update();
        }

    }

    @Override
    // update status verkrijgen
    public Object getUpdate(Observer obj) {
        return this.bericht;
    }

    // methode om het post bericht te weergeven
    public void postBericht(String msg) {
        // printen van bericht
        System.out.println("Bericht geplaats in Onderwerp: " + msg);
        // setten van bericht
        this.bericht = msg;
        // verandering waarnemen
        this.veranderd = true;
        // observer notificeren
        notifyObservers();
    }

}
