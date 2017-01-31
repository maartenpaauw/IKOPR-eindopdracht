// De package.
package fxdatabase;

// Alle imports die deze klasse nodig heeft.
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

// De klasse VeldView die gebouwd is op basis van de Java FX HBox
// en die als observer functioneerd voor het observer pattern.
public class VeldView extends HBox implements Observer {

    // Maak een prive attribuut aan voor het tekstveld.
    private TextField tekst = new TextField();

    // Maak een prive attribuut aan voor de teller.
    private int teller;

    /**
     * De constructor voor de klasse VeldView.
     *
     * @param teller De teller als integer.
     */
    public VeldView(int teller)
    {
        // Zet het attribuut teller.
        this.teller = teller;

        // Zet de tekst voor het tekstveld.
        this.setTekst(teller);

        // Zet de padding.
        this.setPadding(new Insets(10));

        // Zet de hoogte en de breedte van het tekstveld.
        this.tekst.setPrefSize(130, 130);

        // Zorg ervoor dat het nummer in het midden geplaatst wordt van het tekstveld.
        this.tekst.setAlignment(Pos.CENTER);

        // Zorg dat er niet getypt kan worden in het tekstveld.
        this.tekst.setDisable(true);

        // Voeg het tekstveld toe aan de horizontale box.
        this.getChildren().addAll(this.tekst);
    }

    /**
     * Zorg ervoor dat het tekstveld de waarde krijgt van X uit de model * teller.
     *
     * @param x De waarde x als integer.
     */
    @Override
    public void update(int x)
    {
        // Bereken de waarde.
        int waarde = x * this.teller;

        // Update het tekstveld.
        this.setTekst(waarde);
    }

    /**
     *  De waarde van het tekstveld wordt aangepast naar het opgegeven getal.
     *
     * @param x De waarde x als integer.
     */
    private void setTekst(int x)
    {
        this.tekst.setText(Integer.toString(x));
    }
}
