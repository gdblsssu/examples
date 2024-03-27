package DesignPatterns.Structural.Bridge;

// Абстракция
public abstract class Vehicle {
    Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public abstract void start();
    public abstract void stop();
}
