// De package fxmvc.
package fxmvc;

// Maak een nieuwe klasse controller aan.
public class Controller {

    // Maak een prive attribuut voor de model.
    private Model model;

    // Maak een prive attribuut voor de view.
    private View view;

    /**
     * Constructor die de model en de view nodig heeft.
     *
     * @param model De model.
     * @param view  De View.
     */
    public Controller(Model model, View view)
    {
        // Zet de model.
        this.model = model;

        // Zet de view.
        this.view = view;

        // Zet de standaard model waarde in het tekstveld.
        this.updateGetal();

        // Voeg de klik eventlistener toe.
        this.klik();
    }

    /**
     * Methode die zorgt dat het getal update in het tekstveld.
     */
    public void updateGetal()
    {
        // Zet de tekst naar de X uit de model.
        this.view.getTekst().setText(Integer.toString(this.model.getX()));
    }

    /**
     * Methode die een action listener aanmaakt op de knop.
     */
    public void klik()
    {
        // Haal de knop op uit de view en voeg een action listener toe.
        this.view.getKnop().setOnAction(e -> {

            // Voer de tel op methhode uit van de model.
            this.model.telOp();

            // Voer de update getal methode uit.
            this.updateGetal();
        });
    }
}
