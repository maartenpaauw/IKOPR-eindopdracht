package ObserverPattern;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public interface Subject {
    // methode voor het registreren en het verwijderen observers
    public void register(Observer obj);
    public void unregister(Observer obj);

    // methode voor de notificaties observers
    public void notifyObservers();

    // methode om updates te krijgen van het onderwerp
    public Object getUpdate(Observer obj);
}
