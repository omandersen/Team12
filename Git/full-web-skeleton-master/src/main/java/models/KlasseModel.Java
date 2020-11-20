package models;

public class KlasseModel {
    private int KlasseID;
    private String KlasseNavn;


    public KlasseModel(int KlasseID, String KlasseNavn) {
        this.KlasseID = KlasseID;
        this.KlasseNavn = KlasseNavn;

    public int getKlasseID() {
        return KlasseID;
    }

    public void setKlasseID(int klasseID) {
        KlasseID = klasseID;
    }

    public String getKlasseNavn() {
        return KlasseNavn;
    }

    public void setKlasseNavn(String klasseNavn) {
        KlasseNavn = klasseNavn;
    }