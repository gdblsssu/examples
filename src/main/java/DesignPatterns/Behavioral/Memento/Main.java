package DesignPatterns.Behavioral.Memento;

public class Main {
    public static void main(String[] args){
        TextField textField = new TextField();
        textField.setText("asf");
        textField.setStyle("Italic");
        textField.setSize(14);
        System.out.println(textField.toString());

        textField.save();
        textField.setText("qqwe");
        textField.setSize(12);
        System.out.println(textField.toString());

        textField.restore();
        System.out.println(textField.toString());
    }
}
