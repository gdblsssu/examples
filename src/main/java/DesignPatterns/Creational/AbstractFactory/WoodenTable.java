package DesignPatterns.Creational.AbstractFactory;

public class WoodenTable implements Table {
    @Override
    public void fold() {
        System.out.println("The wooden table fold up.");
    }
}
