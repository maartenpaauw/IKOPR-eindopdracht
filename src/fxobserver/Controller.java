// de package.
package fxobserver;

// De klasse controller.
public class Controller
{
    // Maak een prive attribuut aan voor de model.
    private Model model;

    // Maak een prive attribuut aan voor de view.
    private KnopView view;

    /**
     * De constructor voor de klasse controller.
     *
     * @param model de model als Model.
     * @param view  de view als KnopView.
     */
    public Controller(Model model, KnopView view)
    {
        // Zet de model.
        this.model = model;

        // Zet de view.
        this.view = view;

        // Voer de action listener toe.
        this.klik();
    }

    /**
     * Deze methode zorgt ervoor dat er een action listener
     * aangemaakt wordt op de knop.
     */
    public void klik()
    {
        // Voeg een action listener toe aan de knop uit de view.
        this.view.getKnop().setOnAction(e -> {

            // Zorg dat de X waarde binnen de model opgeteld wordt.
            this.model.telOp();

            // Update alle observer objecten (in dit geval standaard 4 stuks).
            this.model.notifyObservers();
        });
    }

    /**
     * Registeer de observer bij de model.
     *
     * @param observer Observer als Observer object.
     */
    public void registerObserver(Observer observer)
    {
        // Registreer de observer bij de model.
        this.model.registerObserver(observer);
    }

    /**
     * Verwijder de observer bij de model.
     *
     * @param observer Observer als Observer object.
     */
    public void removeObserver(Observer observer)
    {
        // Verwijder de observer bij de model.
        this.model.removeObserver(observer);
    }
}
