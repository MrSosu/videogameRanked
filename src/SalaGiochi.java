import java.util.HashMap;
import java.util.HashSet;

public class SalaGiochi {

    private HashMap<Utente, Integer> classificaGlobale = new HashMap<>();
    private HashSet<Videogame> videogames = new HashSet<>();

    /**
     * questo metodo prende in input un utente e lo inserisce nel sistema
     * (specificatamente nella classifica globale)
     * @param u un utente
     */
    private void inserisciUtente(Utente u) { classificaGlobale.put(u, 0); }

    /**
     * questo metodo prende in input un videogame e lo inserisce nel sistema
     * (specificatamente nell'insieme dei videogiochi presenti)
     * @param v un videogioco
     */
    private void inserisciVideogame(Videogame v) { videogames.add(v); }

    private void inserisciPartita(Utente u, Videogame v, int score) {
        if (!v.getClassificaLocale().containsKey(u)) { // se l'utente non ha mai giocato al videogame
            v.addUtente(u, score); // lo inserisco nella classifica locale
            int newValue = classificaGlobale.get(u) + score * v.getDifficolta().getScore();
            classificaGlobale.put(u, newValue);
        }
        else if (v.getClassificaLocale().get(u) < score) { // se l'utente era già presente ma score supera il record
            int oldRecord = v.getClassificaLocale().get(u); // prendo il vecchio record
            v.addUtente(u, score);
            int newValue = classificaGlobale.get(u) - oldRecord * v.getDifficolta().getScore() + score * v.getDifficolta().getScore();
            classificaGlobale.put(u, newValue);
        }
    }

}
