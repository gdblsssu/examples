package DesignPatterns.Behavioral.TemplateMethod;

public class StoneHouse extends HouseBuilder {
    @Override
    protected void buildFoundation() {
        System.out.println("stone foundation");
    }

    @Override
    protected void buildWalls() {
        System.out.println("stone walls");
    }

    @Override
    protected void buildRoof() {
        System.out.println("stone roof");
    }
}
