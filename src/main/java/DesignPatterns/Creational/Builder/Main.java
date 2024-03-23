package DesignPatterns.Creational.Builder;

public class Main {
    public static void main(String[] args){
        Builder builder = new CarBuilder();
        Engine engineSport = new Engine(6, 400);
        builder.setEngine(engineSport);
        builder.setSeats(5);
        builder.setDrive("Front-wheel");
        Car car = builder.build();
    }
}
