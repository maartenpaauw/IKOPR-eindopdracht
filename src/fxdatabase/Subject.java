// De package.
package fxdatabase;

// De interface Subject uit het Observer Pattern.
public interface Subject
{
    /**
     * Deze methode zorgt ervoor dat er een observer toegevoegd
     * kan worden aan de lijst met observers.
     *
     * @param observer De observer als Observer object.
     */
    public void registerObserver(Observer observer);

    /**
     * Deze methode zorgt ervoor dat er een observer verwijderd
     * kan worden uit de lijst met observers.
     *
     * @param observer De observer als Observer object.
     */
    public void removeObserver(Observer observer);

    /**
     * Deze methode zorgt ervoor dat de methode update wordt
     * aangeroepen op de alle observers uit de observer lijst.
     */
    public void notifyObservers();
}