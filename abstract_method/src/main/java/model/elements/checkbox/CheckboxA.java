package model.elements.checkbox;

public class CheckboxA extends Checkbox {
    @Override
    public void display() {
        System.out.printf("[] %s%n", getText());
    }
}
