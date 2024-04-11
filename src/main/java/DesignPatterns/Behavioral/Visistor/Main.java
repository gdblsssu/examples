package DesignPatterns.Behavioral.Visistor;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(5);
        Square square = new Square(5);

        Visitor visitor = new Visitor();

        square.accept(visitor);
        System.out.println("Square area = " + visitor.area);
        circle.accept(visitor);
        System.out.println("Circle area = " + visitor.area);
    }
}
