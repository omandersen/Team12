package models;

public class UserModel {
    private int AtletID;
    private int Alder;
    private String Navn;
    private int KlubbID;
    private int KlasseID;


    public UserModel(int AtletID, int Alder, String Navn, int KlubbID, int KlasseID) {
        this.AtletID = AtletID;
        this.Alder = Alder;
        this.Navn = Navn;
        this.KlubbID = KlubbID;
        this.KlasseID = KlasseID;
    }
    public int getAtletID() {
        return AtletID;
    }

    public void setAtletID(int atletID) {
        AtletID = atletID;
    }

    public int getAlder() {
        return Alder;
    }

    public void setAlder(int alder) {
        Alder = alder;
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

    public int getKlasseID() {
        return KlasseID;
    }

    public void setKlasseID(int klasseID) {
        KlasseID = klasseID;
    }


}
