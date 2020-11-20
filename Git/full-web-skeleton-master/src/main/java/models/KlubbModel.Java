package models;

public class KlubbModel {
    private int KlubbID;
    private String KlubbNavn;


    public KlubbModel(int KlubbID, String KlubbNavn) {
        this.KlubbID = KlubbID;
        this.KlubbNavn = KlubbNavn;

    public int getKlubbID() {
        return KlubbID;
    }

    public void setKlubbID(int klubbID) {
        KlubbID = klubbID;
    }

    public String getKlubbNavn() {
        return KlubbNavn;
    }

    public void setKlubbNavn(String klubbNavn) {
        KlubbNavn = klubbNavn;
    }