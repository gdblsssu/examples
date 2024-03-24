package DesignPatterns.Creational.Prototype;

public class Fanta extends Soda {
    public Fanta(int volume) {
        super(volume);
    }

    @Override
    public Soda clone() {
        return new Fanta(volume);
    }
}
