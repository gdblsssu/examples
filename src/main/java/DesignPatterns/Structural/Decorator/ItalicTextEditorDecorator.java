package DesignPatterns.Structural.Decorator;

public class ItalicTextEditorDecorator extends TextEditorDecorator {
    public ItalicTextEditorDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String edit(){
        return "Italic edit: " + super.edit();
    }
}
