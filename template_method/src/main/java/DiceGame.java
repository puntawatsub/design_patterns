import java.util.LinkedList;
import java.util.List;

public class DiceGame extends Game {

    private List<Player> players;
    private Integer winner;

    @Override
    public void initializeGame(int numberOfPlayers) {
        winner = null;
        players = new LinkedList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player());
        }
    }

    @Override
    public boolean endOfGame() {
        return winner != null;
    }

    @Override
    public void playSingleTurn(int player) {
        var realPlayer = players.get(player);
        realPlayer.incrementScore(Die.getInstance().roll());
        System.out.printf("Player %d: %d score%n", player, realPlayer.getScore());
        if (realPlayer.getScore() >= 60) {
            winner = player;
        }
    }

    @Override
    public void displayWinner() {
        System.out.printf("Winner: Player %d%n", winner);
    }
}
