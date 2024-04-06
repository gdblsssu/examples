package DesignPatterns.Structural.Decorator;


public class BoldTextEditorDecorator extends TextEditorDecorator {
    public BoldTextEditorDecorator(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public String edit(){
        return "Bold edit:" + super.edit();
    }
}
