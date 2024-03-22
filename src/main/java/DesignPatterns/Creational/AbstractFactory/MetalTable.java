package DesignPatterns.Creational.AbstractFactory;

public class MetalTable implements Table {
    @Override
    public void fold() {
        System.out.println("The metal table fold up.");
    }
}
