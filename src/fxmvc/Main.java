// De package fxmvc.
package fxmvc;

// Alle imports die nodig zijn voor deze klasse.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Maak een klasse main aan die de klasse Application nodig heeft van JavaFX.
public class Main extends Application {

    // Maak een prive attribuut aan voor de klasse model.
    private Model model = new Model();

    // Maak een prive attribuut aan voor de klasse view.
    private View view = new View();

    // Maak een prive attribuut aan voor de controller die de model en view nodig heeft.
    private Controller controller = new Controller(model, view);

    // Maak een prive attrivuut met de Java FX scene object aan met daarin de view.
    private Scene scene = new Scene(view, 220, 50);

    // Zorg ervoor dat de JavaFX applicatie gestart wordt.
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        // Geef een titel aan de stage.
        primaryStage.setTitle("Opteller");

        // Voeg de scene toe aan de stage.
        primaryStage.setScene(this.scene);

        // Zorg ervoor dat de stage niet geschaald kan worden.
        primaryStage.setResizable(false);

        // Zorg ervoor dat de stage zichtbaar is.
        primaryStage.show();
    }
}
