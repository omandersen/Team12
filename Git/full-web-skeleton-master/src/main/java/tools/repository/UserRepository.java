package tools.repository;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.UserModel;
import tools.DbTool;

public class UserRepository {
    /**
     * legger til bruker til databasen.
     * Denne er ikke implementert. Her må dere gjerne prøve å lage en egen servlet som kan kommunisere med
     * denne metoden.
     * @param user bruker objekt som inneholder all informasjon om personen.
     * Tips: Objektet må instansieres i en servlet før man kaller på addUser().
     * @param p printwriter for å skrive ut html i servlet. F.eks SQL feilmeldinger eller annen info.
     */

    public static void addUtøver(int id, int Født, String Navn, String Klubb, PrintWriter p) {
        Connection db = null;
        PreparedStatement insertNewUser = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            String query =
                "INSERT INTO `SMUtøver` (Født, Navn, Klubb ) VALUES (?,?,?)";

            insertNewUser = db.prepareStatement(query);

            insertNewUser.setInt(1, Født);
            insertNewUser.setString(2, Navn);
            insertNewUser.setString(3, Klubb);
            insertNewUser.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                db.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

    /**
     * henter ut spesifikk person fra databasen
     * @param username brukerens epost-addresse ("trym@example.com");
     * @param p printwriter see metoden over.
     * @return et String objekt med eposten til brukeren.
     */

    public static String getNavn(String Navn, PrintWriter p) {
        Connection db = null;
        PreparedStatement prepareStatement = null;

        String toReturn = null;
        try {
            db = DbTool.getINSTANCE().dbLoggIn(p);
            ResultSet rs = null;
            String query = "SELECT * FROM roklubb.SMUtøver where Navn = ?";
            prepareStatement = db.prepareStatement(query);
            prepareStatement.setString(1, Navn);
            rs = prepareStatement.executeQuery();
            while (rs.next()) {
                toReturn = rs.getString("Navn");
            }
            rs.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return toReturn;

    }
}