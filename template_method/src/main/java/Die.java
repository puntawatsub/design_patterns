import java.util.Random;

public class Die {

    private static Die instance = null;

    private Die() {
    }

    public static synchronized Die getInstance() {
        if (instance == null) {
            instance = new Die();
        }
        return instance;
    }

    public int roll() {
        var random = new Random();
        return random.nextInt(6) + 1;
    }
}
