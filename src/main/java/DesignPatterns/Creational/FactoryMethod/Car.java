package DesignPatterns.Creational.FactoryMethod;

public class Car implements Transport{

    @Override
    public void drive() {
        System.out.println("The car is driving");
    }
}
