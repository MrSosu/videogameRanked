public enum Difficolta {

    VERY_EASY(1), EASY(2), MEDIUM(3), HARD(4), IMPOSSIBLE(5);

    private int score;

    Difficolta(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
