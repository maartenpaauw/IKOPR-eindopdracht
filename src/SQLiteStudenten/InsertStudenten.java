package SQLiteStudenten;

import java.sql.*;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */


public class InsertStudenten {
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

            // statement openen
            stmt = connectie.createStatement();
            // sql statement voor het inserten van studenten
            String sql = "INSERT INTO STUDENTEN (ID,NAAM,STNUMMER,EMAIL) " +
                    "VALUES (1, 'Maarten Paauw', 1094220, 's1094220@student.hsleiden.nl');";
            // uitvoeren sql statement
            stmt.executeUpdate(sql);

            // sql statement voor het inserten van studenten
            sql = "INSERT INTO STUDENTEN (ID,NAAM,STNUMMER,EMAIL) " +
                    "VALUES (2, 'Zowie van Geest', 1097398, 's1097398@student.hsleiden.nl');";
            // uitvoeren sql statement
            stmt.executeUpdate(sql);

            // sql statement voor het inserten van studenten
            sql = "INSERT INTO STUDENTEN (ID,NAAM,STNUMMER,EMAIL) " +
                    "VALUES (3, 'Gerson Straver', 1092345, 's1092345@student.hsleiden.nl');";
            // uitvoeren sql statement
            stmt.executeUpdate(sql);

            // sql statement voor het inserten van studenten
            sql = "INSERT INTO STUDENTEN (ID,NAAM,STNUMMER,EMAIL) " +
                    "VALUES (4, 'Julia Rijsbergen', 1096092, 's1096092@student.hsleiden.nl');";
            // uitvoeren sql statement
            stmt.executeUpdate(sql);

            // sluiten prepared statements
            stmt.close();
            // doorvoeren wijzigingen sluiten van schrijven erheen
            connectie.commit();
            // connectie sluiten met de db
            connectie.close();
        } catch (Exception e) {
            // Error exception printen als het fout gaat
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            // afsluiten connectie
            System.exit(0);
        }
        // printen status studenten inserten
        System.out.println("Succesvol studenten geinsert");
    }
}