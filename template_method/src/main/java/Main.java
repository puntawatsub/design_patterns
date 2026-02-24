import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of players: ");
        int playerNum = Integer.parseInt(sc.nextLine());
        DiceGame diceGame = new DiceGame();
        diceGame.play(playerNum);
    }
}
