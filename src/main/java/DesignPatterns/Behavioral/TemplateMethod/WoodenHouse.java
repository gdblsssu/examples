package DesignPatterns.Behavioral.TemplateMethod;

public class WoodenHouse extends HouseBuilder {
    @Override
    protected void buildFoundation() {
        System.out.println("wooden foundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("wooden walls");
    }

    @Override
    protected void buildRoof() {
        System.out.println("wooden roof");
    }
}
