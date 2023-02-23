public class Utente {

    private static int idTot = 0;
    private int id;
    private String username;

    public Utente(String username) {
        this.id = ++idTot;
        this.username = username;
    }

    public int getId() { return id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
}
