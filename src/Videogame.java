import java.util.HashMap;

public class Videogame {

    private static int idTot = 0;
    private int id;
    private String name;
    private Difficolta difficolta;

    private HashMap<Utente, Integer> classificaLocale;

    public Videogame(String name, Difficolta difficolta) {
        this.id = ++idTot;
        this.name = name;
        this.difficolta = difficolta;
        this.classificaLocale = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public HashMap<Utente, Integer> getClassificaLocale() {
        return classificaLocale;
    }

    public Difficolta getDifficolta() {
        return difficolta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDifficolta(Difficolta difficolta) {
        this.difficolta = difficolta;
    }

    public void setClassificaLocale(HashMap<Utente, Integer> classificaLocale) {
        this.classificaLocale = classificaLocale;
    }

    /**
     * questo metodo prende in input un utente e un punteggio (record per quel
     * videogame) e aggiorna la classifica locale del videogame stesso.
     * @param u un utente
     * @param score un intero che rappresenta un punteggio
     */
    public void addUtente(Utente u, int score) { classificaLocale.put(u, score); }
}
