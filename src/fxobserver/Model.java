// De package.
package fxobserver;

// De imports die nodig zijn voor deze klasse.
import java.util.ArrayList;

// De klasse model die functioneerd als subject van het observer pattern.
public class Model implements Subject
{
    // Maak een prive attribuut aan voor de integer x.
    private int x;

    // Maak een prive attribuut aan voor de observers lijst.
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    /**
     * Een constructor die de x waarde op de standaard 1 zet.
     */
    public Model()
    {
        this.x = 1;
    }

    /**
     * Een constructor die de x waarde aanpast naar het opgegeven getal.
     *
     * @param x De waarde voor X als integer.
     */
    public Model(int x)
    {
        this.x = x;
    }

    /**
     * Verkrijg de waarde X.
     *
     * @return X als integer.
     */
    public int getX()
    {
        return this.x;
    }

    /**
     * Zet de waarde x naar het opgegeven nummer.
     *
     * @param x De waarde voor x als integer.
     */
    public void setX(int x)
    {
        this.x = x;
    }

    /**
     * Tel de waarde van x op met 1.
     */
    public void telOp()
    {
        this.x++;
    }

    /**
     * Voeg een observer toe aan de observers lijst.
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer)
    {
        // Voeg de observer toe.
        this.observers.add(observer);
    }

    /**
     * Verwijder een observer van de observers lijst.
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer)
    {
        // Verwijder de observer op basis van de index.
        this.observers.remove(this.observers.indexOf(observer));
    }

    /**
     * Roep de methode update aan op alle observers.
     */
    @Override
    public void notifyObservers()
    {
        // Ga door alle observers heen.
        for (Observer observer: this.observers)
        {
            // Voer de methode update uit.
            observer.update(this.x);
        }
    }
}
