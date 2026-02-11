import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        Character character = new Character(sc.nextLine());
        while (true) {
            character.printStatus();
            while (true) {
                System.out.print("Train (T), Meditate (M), Fight (F): ");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("t")) {
                    character.train();
                    break;
                } else if (choice.equalsIgnoreCase("m")) {
                    character.meditate();
                    break;
                } else if (choice.equalsIgnoreCase("f")) {
                    character.fight();
                    break;
                }
            }
        }
    }
}
