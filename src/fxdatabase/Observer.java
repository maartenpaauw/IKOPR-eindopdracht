// De package.
package fxdatabase;

// De interface Observer uit het Observer Pattern.
public interface Observer
{
    /**
     * De update methode die ervoor zorgt dat de
     * date geupdatet wordt in de view.
     *
     * @param x De waarde X uit de model als integer.
     */
    public void update(int x);
}
