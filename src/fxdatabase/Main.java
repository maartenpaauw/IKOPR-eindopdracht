package fxdatabase;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public Model      model      = new Model();
    public KnopView   view       = new KnopView();
    public Controller controller = new Controller(model, view);
    private Scene     scene      = new Scene(view, 150, 150);

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Opteller");
        primaryStage.setScene(this.scene);
        primaryStage.setResizable(false);

        primaryStage.setX((25));
        primaryStage.setY(25);

        primaryStage.show();

        for(int teller = 1; teller < 5; teller++)
        {
            VeldView veldView = new VeldView(teller);
            Stage    stage    = new Stage();

            this.model.registerObserver(veldView);

            stage.setTitle("Teller - " + Integer.toString(teller) + "x");
            stage.setScene(new Scene(veldView, 150, 150));
            stage.setResizable(false);

            stage.setX(25 + (175 * teller));
            stage.setY(25);

            stage.show();
        }

        controller.getX();

        primaryStage.setOnCloseRequest(we -> this.controller.close());
    }
}
