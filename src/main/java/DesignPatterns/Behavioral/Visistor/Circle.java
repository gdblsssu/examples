package DesignPatterns.Behavioral.Visistor;

public class Circle implements Shape {
    int radius;



    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle with radius: " + radius);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getRadius() {
        return radius;
    }
}
