package DesignPatterns.Structural.Composite;

public class TextField implements UIComponent {
    @Override
    public void draw() {
        System.out.println("Draw the TextField");
    }
}
