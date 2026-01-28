package model.elements;

public abstract class Element {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public abstract void display();
}
