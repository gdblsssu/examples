package DesignPatterns.Creational.FactoryMethod;

public class BicycleFactory extends BMW{
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
