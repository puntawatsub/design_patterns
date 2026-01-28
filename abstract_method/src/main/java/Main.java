import model.AFactory;
import model.BFactory;
import model.UIFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UIFactory factory;
        Scanner sc = new Scanner(System.in);
        System.out.print("Select style (A or B): ");
        String result = sc.nextLine();
        if (result.equalsIgnoreCase("a")) {
            factory = new AFactory();
        } else if (result.equalsIgnoreCase("b")) {
            factory = new BFactory();
        } else {
            throw new IllegalArgumentException("Value not A or B");
        }
        var button = factory.createButton("Button");
        var checkbox = factory.createCheckbox("Checkbox");
        var textField = factory.createTextField("TextField");
        while (true) {
            button.display();
            checkbox.display();
            textField.display();
            System.out.print("Enter text to display or press enter now to exit: ");
            String text = sc.nextLine();
            if (text.isBlank()) {
                break;
            }
            button.setText(text);
            checkbox.setText(text);
            textField.setText(text);
        }
    }
}
