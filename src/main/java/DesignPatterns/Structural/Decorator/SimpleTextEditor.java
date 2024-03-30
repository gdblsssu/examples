package DesignPatterns.Structural.Decorator;

public class SimpleTextEditor implements TextEditor {
    private String text = "";

    public SimpleTextEditor(String text) {
        this.text = text;
    }

    @Override
    public String edit() {
        text = "Simple edit: " + text;
        return text;
    }

}
