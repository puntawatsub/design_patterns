package model;

import model.elements.button.Button;
import model.elements.button.ButtonA;
import model.elements.checkbox.Checkbox;
import model.elements.checkbox.CheckboxA;
import model.elements.textField.TextField;
import model.elements.textField.TextFieldA;

public class AFactory extends UIFactory {
    @Override
    public Button createButton(String text) {
        var result = new ButtonA();
        result.setText(text);
        return result;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        var result = new CheckboxA();
        result.setText(text);
        return result;
    }

    @Override
    public TextField createTextField(String text) {
        var result = new TextFieldA();
        result.setText(text);
        return result;
    }
}
