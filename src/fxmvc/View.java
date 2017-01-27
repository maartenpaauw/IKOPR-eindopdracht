package fxmvc;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


public class View extends HBox {

    private TextField tekst = new TextField();
    private Button    knop  = new Button("+");

    public View()
    {
        super(10);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(this.tekst, this.knop);

        this.tekst.setDisable(true);
    }

    public Button getKnop()
    {
        return this.knop;
    }

    public TextField getTekst()
    {
        return this.tekst;
    }
}
