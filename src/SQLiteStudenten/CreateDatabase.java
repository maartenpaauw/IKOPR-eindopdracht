package SQLiteStudenten;

import java.sql.*;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public class CreateDatabase {
    public static void main(String args[]) {
        // connectie aanmaken en op null zetten
        Connection connectie = null;
        // Try
        try {
            // aangeven connectie protocol
            Class.forName("org.sqlite.JDBC");
            // connectie naar onze studenten db dmv drivermanager sqlite van JDBC
            connectie = DriverManager.getConnection("jdbc:sqlite:studenten.db");
        } catch (Exception e) {
            // Error exception printen als het fout gaat
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            // afsluiten connectie
            System.exit(0);
        }
        // print als de connectie geopend is
        System.out.println("DB Succesvol geopend");
    }
}