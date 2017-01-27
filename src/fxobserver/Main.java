package fxobserver;

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

        primaryStage.setX((875));
        primaryStage.setY(175);

        primaryStage.show();

        for(int i = 1; i < 5; i++)
        {
            VeldView veldView = new VeldView(i);
            Stage    stage    = new Stage();

            this.model.registerObserver(veldView);

            stage.setTitle("Teller - " + Integer.toString(i));
            stage.setScene(new Scene(veldView, 150, 150));
            stage.setResizable(false);

            stage.setX((175 * i));
            stage.setY(175);

            stage.show();
        }
    }
}
