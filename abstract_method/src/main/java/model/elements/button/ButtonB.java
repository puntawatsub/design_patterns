package model.elements.button;

public class ButtonB extends Button {
    @Override
    public void display() {
        System.out.printf("╔══════╗\n" +
                "║  %s  ║\n" +
                "╚══════╝%n", getText());
    }
}
