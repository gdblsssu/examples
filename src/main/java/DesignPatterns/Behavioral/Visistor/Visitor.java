package DesignPatterns.Behavioral.Visistor;

public class Visitor {

    int area;

    public void visit(Circle circle){
        area = (int) 3.14 * circle.getRadius() * circle.getRadius();
    }

    public void visit(Square square){
        area = square.getWidth() * square.getWidth();
    }
}
