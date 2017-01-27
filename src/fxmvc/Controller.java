package fxmvc;

public class Controller {

    private Model model;
    private View  view;

    public Controller(Model model, View view)
    {
        this.model = model;
        this.view  = view;

        this.updateGetal();
        this.klik();
    }

    public void updateGetal()
    {
        this.view.getTekst().setText(Integer.toString(this.model.getX()));
    }

    public void klik()
    {
        this.view.getKnop().setOnAction(e -> {
            this.model.telOp();
            this.updateGetal();
        });
    }
}
