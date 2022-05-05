package emailverwaltung;

import java.sql.*;

public class EmailKontaktDAO {

    private String url;

    public EmailKontaktDAO() {
        //Datenbankklasse dynamisch erzeugen
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String datei = "emails.db";
        url = "jdbc:sqlite:"+ datei;
    }

    public EmailKontakt select(int id) {

        //Verbindung initialisieren
        try {
            Connection conn = DriverManager.getConnection(url);

            String sql = "SELECT * FROM emails.db WHERE MIN(id)";

            PreparedStatement statement = conn.prepareStatement(sql);

            //statement.setInt(1, 73); ResultSet resultSet = statement.executeQuery();

            //resultset.next(); Kunde kunde = new Kunde();
            //kunde.setId(resultSet.getInt("id"));
            //kunde.setVorname(resultSet.getString("vorname"));
            //kunde.setNachname(resultSet.getString("nachname"));




        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public EmailKontakt first() {
        return null;
    }

    public EmailKontakt last() {
        return null;
    }

    public EmailKontakt next(EmailKontakt emailKontakt) {
        return null;
    }

    public EmailKontakt previous(EmailKontakt emailKontakt) {
        return null;
    }

    public void delete(EmailKontakt emailKontakt) {

    }

    public void insert(EmailKontakt emailKontakt) {

    }

    public void update(EmailKontakt emailKontakt) {

    }


}
