package model.elements.checkbox;

public class CheckboxB extends Checkbox {
    @Override
    public void display() {
        System.out.printf("☐ %s%n", getText());
    }
}
