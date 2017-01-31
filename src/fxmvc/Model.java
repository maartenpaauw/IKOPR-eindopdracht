// De package fxmvc.
package fxmvc;

// Maak de klasse model aan.
public class Model {

    // Maak een prive attribuut aan voor de variable x.
    private int x;

    /**
     * Een constructor die de x waarde op de standaard 1 zet.
     */
    public Model()
    {
        this.x = 1;
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
}