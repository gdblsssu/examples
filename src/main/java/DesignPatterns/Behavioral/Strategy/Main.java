package DesignPatterns.Behavioral.Strategy;

public class Main {
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor(new BoldStrategy());

        System.out.println(textEditor.edit("Bold text."));
        textEditor.setStrategy(new ItalicStrategy());
        System.out.println(textEditor.edit("Italic text."));
        textEditor.setStrategy(new LinkStrategy());
        System.out.println(textEditor.edit("Link text."));
    }
}
