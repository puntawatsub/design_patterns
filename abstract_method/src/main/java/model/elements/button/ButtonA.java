package model.elements.button;

public class ButtonA extends Button {
    @Override
    public void display() {
        System.out.printf("[ %s ]%n", getText());
    }
}
