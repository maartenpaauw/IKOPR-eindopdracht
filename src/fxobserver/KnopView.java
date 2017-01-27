package fxobserver;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class KnopView extends HBox
{
    private Button knop = new Button("+");

    public KnopView()
    {
        this.setPadding(new Insets(10));
        this.knop.setPrefSize(130, 130);
        this.getChildren().addAll(this.knop);
    }

    public Button getKnop()
    {
        return this.knop;
    }
}
