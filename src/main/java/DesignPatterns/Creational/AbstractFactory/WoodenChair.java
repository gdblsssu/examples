package DesignPatterns.Creational.AbstractFactory;

public class WoodenChair implements Chair{
    @Override
    public void fold() {
        System.out.println("The wooden chair fold up.");
    }
}
