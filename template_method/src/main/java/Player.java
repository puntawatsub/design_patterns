public class Player {
    private int score;

    public Player() {
        score = 0;
    }

    public void incrementScore(int num) {
        score += num;
    }

    public int getScore() {
        return score;
    }
}
