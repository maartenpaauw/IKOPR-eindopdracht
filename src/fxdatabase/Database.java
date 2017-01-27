package fxdatabase;

import java.sql.*;

public class Database
{
    static final String DB_URL = "jdbc:sqlite:db.sqlite";
    static final String CLASS  = "org.sqlite.JDBC";

    private Connection        connection;
    private PreparedStatement selectX;
    private PreparedStatement updateX;
    private ResultSet         resultaat;

    public Database()
    {
        try
        {
            Class.forName(CLASS);
            this.connection = DriverManager.getConnection(DB_URL);

            this.prepareStatements();
        }

        catch (Exception e) {}
    }

    private void prepareStatements()
    {
        try {
            this.selectX = this.connection.prepareStatement("SELECT * FROM getal LIMIT 1");
            this.updateX = this.connection.prepareStatement("UPDATE getal set x = ?");
        }

        catch (SQLException e) {}
    }

    public int getX()
    {
        int x = 0;

        try
        {
            this.resultaat = this.selectX.executeQuery();
            x = this.resultaat.getInt("x");
        }

        catch (Exception e) {}

        return x;
    }

    public void updateX(int x)
    {
        try
        {
            this.updateX.setInt(1, x);
            this.updateX.executeUpdate();
        }

        catch (Exception e) {}
    }

    public void close()
    {
        try
        {
            this.connection.close();
            this.selectX.close();
            this.updateX.close();
            this.resultaat.close();
        }

        catch (Exception e) {}
    }
}