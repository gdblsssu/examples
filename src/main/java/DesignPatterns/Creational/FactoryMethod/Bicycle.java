package DesignPatterns.Creational.FactoryMethod;

public class Bicycle implements Transport{
    @Override
    public void drive() {
        System.out.println("The bicycle is driving");
    }
}
