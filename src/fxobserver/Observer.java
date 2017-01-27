// De package.
package fxobserver;

// De interface Observer uit het Observer Pattern.
public interface Observer
{
    /**
     * De methode update zorgt ervoor dat de data
     * van de observer geupdatet wordt.
     *
     * @param x De waarde x als integer.
     */
    public void update(int x);
}
