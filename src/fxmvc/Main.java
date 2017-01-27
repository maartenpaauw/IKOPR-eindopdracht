package fxmvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Model      model      = new Model();
    private View       view       = new View();
    private Controller controller = new Controller(model, view);

    private Scene      scene      = new Scene(view, 220, 50);

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Opteller");
        primaryStage.setScene(this.scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
