package ObserverPattern;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public interface Observer {
    // methode voor het updaten van de observer wordt gebruikt door subject
    public void update();

    // toevoegen met onderwerp aan de observer
    public void setOnderwerp(Subject sub);
}
