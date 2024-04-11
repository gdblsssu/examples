package DesignPatterns.Behavioral.Visistor;

public class Square implements Shape {
    int width;

    public Square(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("Draw square with width: " + width);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
