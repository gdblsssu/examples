package DesignPatterns.Creational.Prototype;

public class Cola extends Soda {
    String sugar;
    public Cola(int volume, String sugar) {
        super(volume);
        this.sugar = sugar;
    }

    @Override
    public Soda clone() {
        return new Cola(volume, sugar);
    }
}
