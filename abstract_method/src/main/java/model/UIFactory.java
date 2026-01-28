package model;

import model.elements.button.Button;
import model.elements.checkbox.Checkbox;
import model.elements.textField.TextField;

abstract public class UIFactory {
    public abstract Button createButton(String text);
    public abstract Checkbox createCheckbox(String text);
    public abstract TextField createTextField(String text);
}
