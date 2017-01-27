package SQLiteStudenten;

import java.sql.*;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public class Main {
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

            // connectie open houden voor voor alle insert als deze op true staat sluit die na elke execute
            connectie.setAutoCommit(false);
            // print voor het openen DB connectie
            System.out.println("DB Succesvol geopend");
            System.out.println();

            // statement openen
            stmt = connectie.createStatement();
            // resultaten set aanmaken die de query uitvoert en opslaat in resultaat
            ResultSet resultaat = stmt.executeQuery("SELECT * FROM STUDENTEN;");
            // while loop voor het ophalen van de resultaten
            while (resultaat.next()) {
                // id ophalen
                int id = resultaat.getInt("id");
                // naam ophalen
                String name = resultaat.getString("naam");
                // studentnummer ophalen
                int stnumber = resultaat.getInt("stnummer");
                // email ophalen
                String email = resultaat.getString("email");

                // printen van alle resultaten
                System.out.println("Student:");
                System.out.println("ID = " + id);
                System.out.println("NAAM = " + name);
                System.out.println("STUDENTENNUMMER = " + stnumber);
                System.out.println("EMAIL = " + email);
                System.out.println();
            }
            //resultset sluiten
            resultaat.close();
            // statement sluiten
            stmt.close();
            // connectie sluiten
            connectie.close();
        } catch (Exception e) {
            // Error exception printen als het fout gaat
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            // afsluiten connectie
            System.exit(0);
        }
        // printen als het uitgevoerd is
        System.out.println("Succesvol uitgevoerd");
    }
}