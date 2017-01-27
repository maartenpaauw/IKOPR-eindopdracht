package fxdatabase;

public class Controller
{
    private Model    model;
    private KnopView view;
    private Database database;

    public Controller(Model model, KnopView view)
    {
        this.model    = model;
        this.view     = view;
        this.database = new Database();

        this.getX();
        this.klik();
    }

    private void klik()
    {
        this.view.getKnop().setOnAction(e -> {
            this.model.telOp();
            this.setX(this.model.getX());
            this.model.notifyObservers();
        });
    }

    private void getX()
    {
        this.model.setX(database.getX());
        this.model.notifyObservers();
    }

    private void setX(int x)
    {
        this.database.updateX(x);
    }
}
