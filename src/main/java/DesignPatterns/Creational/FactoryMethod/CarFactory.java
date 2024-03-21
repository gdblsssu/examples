package DesignPatterns.Creational.FactoryMethod;

public class CarFactory extends BMW{
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
