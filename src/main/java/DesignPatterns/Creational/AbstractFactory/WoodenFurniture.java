package DesignPatterns.Creational.AbstractFactory;

public class WoodenFurniture implements AbstractFurniture {
    @Override
    public Chair createChair() {
        return new WoodenChair();
    }

    @Override
    public Table createTable() {
        return new MetalTable();
    }
}
