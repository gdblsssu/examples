package DesignPatterns.Creational.AbstractFactory;

public class MetalChair implements Chair{
    @Override
    public void fold() {
        System.out.println("The metal chair fold up.");
    }
}
