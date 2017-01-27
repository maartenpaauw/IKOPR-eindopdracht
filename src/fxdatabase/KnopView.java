// De package.
package fxdatabase;

// Alle imports die nodig zijn voor deze klasse.
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

// De klasse KnopView die de horizontale box nodig heeft.
public class KnopView extends HBox
{
    // Maak een prive attribuut aan de knop.
    private Button knop = new Button("+");

    /**
     * De constructor voor de klasse KnopView.
     */
    public KnopView()
    {
        // Zet de padding voor de horizontale box.
        this.setPadding(new Insets(10));

        // Zorg dat de knop een standaard formaat heeft van 130 x 130 pixels.
        this.knop.setPrefSize(130, 130);

        // Voeg de knop toe aan de KnopView (de horizontale box).
        this.getChildren().addAll(this.knop);
    }

    /**
     * Verkrijg de knop.
     *
     * @return verkrijg de knop als Button object.
     */
    public Button getKnop()
    {
        return this.knop;
    }
}
