package DesignPatterns.Behavioral.Visistor;

interface Shape {
    void draw();
    void accept(Visitor visitor);
}
