package model.elements.textField;

public class TextFieldA extends TextField {
    @Override
    public void display() {
        System.out.printf("___%s___%n", getText());
    }
}
