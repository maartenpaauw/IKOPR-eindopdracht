// De package.
package fxdatabase;

// De imports die deze klasse nodig heeft.
import java.sql.*;

// De klasse database.
public class Database
{
    // De database url.
    static final String DB_URL = "jdbc:sqlite:db.sqlite";

    // Het pad naar de klasse voor JDBC voor sqlite.
    static final String CLASS  = "org.sqlite.JDBC";

    // Prive attribuut voor de connectie.
    private Connection connection;

    // Prive attribuut voor de select prepared statement.
    private PreparedStatement selectX;

    // Prive attribuut voor de update prepared statement.
    private PreparedStatement updateX;

    // Prive attribuut voor het resultaat van de query.
    private ResultSet resultaat;

    /**
     * De constructor voor de database klasse.
     */
    public Database()
    {
        // Probeer.
        try
        {
            // Controleer of de klasse gevonden kan worden.
            Class.forName(CLASS);

            // Maak de connectie aan.
            this.connection = DriverManager.getConnection(DB_URL);

            // Voer de methode prepare statements uit.
            this.prepareStatements();
        }

        // Vang alle excepties af.
        catch (Exception e) {}
    }

    /**
     * Maak alle prepared statements aan de nodig zijn.
     */
    private void prepareStatements()
    {
        // Probeer.
        try
        {
            // Maak de prepared statement voor de select aan.
            this.selectX = this.connection.prepareStatement("SELECT * FROM getal LIMIT 1");

            // Maak de prepared statement voor de update aan.
            this.updateX = this.connection.prepareStatement("UPDATE getal set x = ?");
        }

        // Vang alle excepties af.
        catch (SQLException e) {}
    }


    /**
     * Methode die de variabele X ophaalt uit de database.
     * @return
     */
    public int getX()
    {
        // De standaard X is 1.
        int x = 1;

        // Probeer.
        try
        {
            // Voer de select query uit.
            this.resultaat = this.selectX.executeQuery();

            // Sla de waarde van x op.
            x = this.resultaat.getInt("x");
        }

        // Vang alle exepties af.
        catch (Exception e) {}

        // Geef de waarde X terug.
        return x;
    }

    /**
     * Methode die de variabele X wegschrijft naar de database.
     *
     * @param x De waarde X als integer.
     */
    public void updateX(int x)
    {
        // Probeer.
        try
        {
            // Zet de waarde van X in de prepared statement.
            this.updateX.setInt(1, x);

            // Voer de update query uit.
            this.updateX.executeUpdate();
        }

        // Vang alle excepties af.
        catch (Exception e) {}
    }

    /**
     * Methode die alle connecties met de database sluit.
     */
    public void close()
    {
        // Probeer.
        try
        {
            // Sluit de connectie af.
            this.connection.close();

            // Sluit de select statement af.
            this.selectX.close();

            // Sluit de update statement af.
            this.updateX.close();

            // Sluit de resultaat af.
            this.resultaat.close();
        }

        // Vang alle excepties af.
        catch (Exception e) {}
    }
}