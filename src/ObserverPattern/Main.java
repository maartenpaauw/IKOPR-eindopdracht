package ObserverPattern;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public class Main {
    public static void main(String[] args) {
        // aanmaken onderwerp
        MijnPost post = new MijnPost();

        // aanmaken observers
        Observer observer1 = new MijnPostSubscriber("Observer1");
        Observer observer2 = new MijnPostSubscriber("Observer2");
        Observer observer3 = new MijnPostSubscriber("Observer3");

        // registreren observers bij de post
        post.register(observer1);
        post.register(observer2);
        post.register(observer3);

        // observers toevoegen aan subject
        observer1.setOnderwerp(post);
        observer2.setOnderwerp(post);
        observer3.setOnderwerp(post);

        // check of er updates zijn
        observer1.update();

        // bericht versturen naar elke observer
        post.postBericht("Hallo Studenten van de hogeschool Leiden");
    }
}
