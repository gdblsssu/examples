package DesignPatterns.Structural.Composite;

public class Button implements UIComponent {
    @Override
    public void draw() {
        System.out.println("Draw the button");
    }
}
