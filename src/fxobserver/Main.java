// De package.
package fxobserver;

// Alle imports die deze klasse nodig heeft.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

// De klasse main die de Java FX klasse Application nodig heeft.
public class Main extends Application {

    // Maak een prive attribuut aan voor de model.
    public Model model = new Model();

    // Maak een prive attribuut aan voor de view.
    public KnopView view = new KnopView();

    // Maak een prive attribuut aan voor de controller die de model en de view nodig heeft.
    public Controller controller = new Controller(model, view);

    // Maak een prive attribuut aan voor de scene die de view nodig heeft.
    private Scene scene = new Scene(view, 150, 150);

    /**
     * Zorg ervoor dat de Java FX applicatie gestart kan worden.
     *
     * @param args alle argumenten.
     */
    public static void main(String[] args) { launch(args); }

    /**
     * Zorg ervoor dat de Java FX applicatie zichtbaar wordt.
     */
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        // Zet de titel van de stage.
        primaryStage.setTitle("Opteller");

        // Voeg de scene toe aan de stage.
        primaryStage.setScene(this.scene);

        // Zorg ervoor dat de stage niet schaalbaar is.
        primaryStage.setResizable(false);

        // Zet de X locatie van de stage op het scherm.
        primaryStage.setX(25);

        // Zet de Y locatie van de stage op het scherm.
        primaryStage.setY(25);

        // Maak de stage zichtbaar.
        primaryStage.show();

        // For loop met een integer teller (wordt 4 keer uitgevoerd).
        for(int teller = 1; teller < 5; teller++)
        {
            // Maak een nieuwe view aan waar de teller aan meegegeven wordt.
            VeldView veldView = new VeldView(teller);

            // Maak een nieuwe stage aan.
            Stage stage = new Stage();

            // Voeg de view toe aan de lijst met observers.
            this.model.registerObserver(veldView);

            // Geef de stage een titel.
            stage.setTitle("Teller - " + Integer.toString(teller) + "x");

            // Voeg de scene, waaraan de view wordt meegegeven, toe aan de stage.
            stage.setScene(new Scene(veldView, 150, 150));

            // Zorg ervoor dat de stage niet schaalbaar is.
            stage.setResizable(false);

            // Zet de X positie van de stage op het scherm.
            stage.setX(25 + (175 * teller));

            // Zet de Y positie van de stage op het scherm.
            stage.setY(25);

            // Zorg ervoor dat de stage zichtbaar wordt.
            stage.show();
        }
    }
}
