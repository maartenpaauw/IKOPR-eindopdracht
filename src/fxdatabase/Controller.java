// De package
package fxdatabase;

// De klasse controller.
public class Controller
{
    // Prive attribuut voor de klasse model.
    private Model model;

    // Prive attribuut voor de klase view.
    private KnopView view;

    // Prive attribuut voor de klasse database.
    private Database database;

    /**
     * De controller constructor.
     *
     * @param model De model als Model.
     * @param view  De view als KnopView.
     */
    public Controller(Model model, KnopView view)
    {
        // De model wordt geset.
        this.model = model;

        // De view wordt geset.
        this.view = view;

        // Maak een nieuwe instantie aan voor de database.
        this.database = new Database();

        // Voer de getX methode uit.
        this.getX();

        // Voeg de action listeners toe.
        this.klik();
    }

    /**
     * Voeg de action listener toe aan de knop uit de view.
     */
    private void klik()
    {
        // Haal de knop op uit de view.
        this.view.getKnop().setOnAction(e -> {

            // Tel de X op uit de model.
            this.model.telOp();

            // Sla de X op in de database.
            this.setX(this.model.getX());

            // Laat het alle observers weten.
            this.model.notifyObservers();
        });
    }

    /**
     * Haal de X op uit de database en sla het op in de model.
     */
    public void getX()
    {
        // Sla de X op uit de database in de model.
        this.model.setX(database.getX());

        // Laat het alle observers weten.
        this.model.notifyObservers();
    }

    /**
     * Sla de X op in de database.
     *
     * @param x
     */
    private void setX(int x)
    {
        // Sla het opgegeven variabele x op in de database.
        this.database.updateX(x);
    }

    /**
     * Zorg ervoor dat de database connectie gesloten kan worden.
     */
    public void close()
    {
        // Sluit de database connecties.
        this.database.close();
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
