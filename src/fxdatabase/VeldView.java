package fxdatabase;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class VeldView extends HBox implements Observer {

    private TextField tekst = new TextField();
    private int       teller;

    public VeldView(int teller)
    {
        this.teller = teller;
        this.setTekst(teller);
        this.setPadding(new Insets(10));

        this.tekst.setPrefSize(130, 130);
        this.tekst.setAlignment(Pos.CENTER);
        this.tekst.setDisable(true);

        this.getChildren().addAll(this.tekst);
    }

    @Override
    public void update(int x)
    {
        this.setTekst(x * this.teller);
    }

    private void setTekst(int x)
    {
        this.tekst.setText(Integer.toString(x));
    }
}
