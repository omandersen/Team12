package models;

public class TrenerModel {
    private int TrenerID;
    private String Navn;
    private int KlubbID;


    public TrenerModel(int TrenerID, String Navn, int KlubbID) {
        this.TrenerID = TrenerID;
        this.Navn = Navn;
        this.KlubbID = KlubbID;

    public int getTrenerID() {
        return TrenerID;
    }

    public void setTrenerID(int trenerID) {
        TrenerID = trenerID;
    }

    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public int getKlubbID() {
        return KlubbID;
    }

    public void setKlubbID(int klubbID) {
        KlubbID = klubbID;
    }