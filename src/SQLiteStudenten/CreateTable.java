package SQLiteStudenten;

import java.sql.*;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public class CreateTable {

    public static void main(String args[]) {
        // connectie aanmaken en op null zetten
        Connection connectie = null;
        // prepared statements variable
        Statement stmt = null;
        try {
            // aangeven connectie protocol
            Class.forName("org.sqlite.JDBC");
            // connectie naar onze studenten db dmv drivermanager sqlite van JDBC
            connectie = DriverManager.getConnection("jdbc:sqlite:studenten.db");
            // print als de connectie geopend is
            System.out.println("DB Succesvol geopend");

            // statement openen
            stmt = connectie.createStatement();
            // sql string voor het aanmaken van de tabel
            String sql = "CREATE TABLE STUDENTEN " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NAAM           TEXT    NOT NULL, " +
                    " STNUMMER            INT     NOT NULL, " +
                    " EMAIL        CHAR(28) NOT NULL)";
            // uitvoeren van de sqlstatement
            stmt.executeUpdate(sql);
            // sluiten van de connectie met statement
            stmt.close();
            // connectie sluiten met de database
            connectie.close();
        } catch (Exception e) {
            // Error exception printen als het fout gaat
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            // afsluiten connectie
            System.exit(0);
        }
        // print voor het aanmaken van de tabel
        System.out.println("Tabel is aangemaakt");
    }
}
