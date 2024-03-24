package DesignPatterns.Creational.Prototype;

public abstract class Soda {
    int volume;


    public Soda(int volume) {
        this.volume = volume;
    }

    public abstract Soda clone();
}
