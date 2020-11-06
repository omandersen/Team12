package models;

public class UserModel {
    private int UtøverID;
    private int Født;
    private String Navn;
    private String Klubb;


    /**
     *
     * @param firstName the users firstname
     * @param lastName the users lastname
     * @param userName the users email .e.g., example@example.com
     * @param password the users password: we usually encrypt it in the database but thats for you to figure out :)
     */
    public UserModel(int UtøverID, int Født, String Navn, String Klubb) {
        this.UtøverID = UtøverID;
        this.Født = Født;
        this.Navn = Navn;
        this.Klubb = Klubb;
    }

    /**
     *
     * GETTERS AND SETTERS!
     */

    public int getUtøverID() {
        return UtøverID;
    }

    public void setUtøverID(int utøverID) { UtøverID = utøverID;
    }

    public int getFødt() {
        return Født;
    }

    public void setFødt(int født) {
        Født = født;
    }

    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public String getKlubb() {
        return Klubb;
    }

    public void setKlubb(String klubb) {
        Klubb = klubb;
    }
}
