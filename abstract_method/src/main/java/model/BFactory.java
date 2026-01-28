package model;

import model.elements.button.Button;
import model.elements.button.ButtonB;
import model.elements.checkbox.Checkbox;
import model.elements.checkbox.CheckboxB;
import model.elements.textField.TextField;
import model.elements.textField.TextFieldB;

public class BFactory extends UIFactory {
    @Override
    public Button createButton(String text) {
        var result = new ButtonB();
        result.setText(text);
        return result;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        var result = new CheckboxB();
        result.setText(text);
        return result;
    }

    @Override
    public TextField createTextField(String text) {
        var result = new TextFieldB();
        result.setText(text);
        return result;
    }
}
