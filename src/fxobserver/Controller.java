package fxobserver;

public class Controller
{
    private Model    model;
    private KnopView view;

    public Controller(Model model, KnopView view)
    {
        this.model = model;
        this.view  = view;

        this.klik();
    }

    public void klik()
    {
        this.view.getKnop().setOnAction(e -> {
            this.model.telOp();
            this.model.notifyObservers();
        });
    }
}
