package model.elements.textField;

public class TextFieldB extends TextField {
    @Override
    public void display() {
        System.out.printf("╔════════════╗\n" +
                "║     %s    ║\n" +
                "╚════════════╝%n", getText());
    }
}
