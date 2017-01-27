// De package fxmvc.
package fxmvc;

// Alle imports die deze klasse nodig heeft.
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

// De klasse view die alles van HBox van Java FX nodig heeft.
public class View extends HBox {

    // Maak een prive attribuut aan voor het tekstveld.
    private TextField tekst = new TextField();

    // Maak een prive attribuut aan voor de knop.
    private Button knop = new Button("+");

    /**
     * De constructor voor de klasse view.
     */
    public View()
    {
        // Zorg ervoor dat de horizontale box een spacing heeft van 10 pixels.
        super(10);

        // Zet de alignment van alle elementen binnen de horizontale box op gecentreerd.
        this.setAlignment(Pos.CENTER);

        // Voeg het tekstveld en de knop toe aan de horizonale box.
        this.getChildren().addAll(this.tekst, this.knop);

        // Zorg ervoor dat er geen getal ingevoerd kan worden in het tekstveld.
        this.tekst.setDisable(true);
    }

    /**
     * Verkrijg de knop.
     *
     * @return Geef de knop terug als Button object.
     */
    public Button getKnop()
    {
        return this.knop;
    }

    /**
     * Verkrijg het tekstveld.
     *
     * @return Geef het tekstveld terug als TextField object.
     */
    public TextField getTekst()
    {
        return this.tekst;
    }
}
