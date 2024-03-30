package DesignPatterns.Structural.Decorator;

public abstract class TextEditorDecorator implements TextEditor {
    TextEditor textEditor;

    public TextEditorDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public String  edit() {
        return textEditor.edit();
    }

}
