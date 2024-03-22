package DesignPatterns.Creational.AbstractFactory;

public class MetalFurniture implements AbstractFurniture {
    @Override
    public Chair createChair() {
        return new MetalChair();
    }

    @Override
    public Table createTable() {
        return new MetalTable();
    }
}
