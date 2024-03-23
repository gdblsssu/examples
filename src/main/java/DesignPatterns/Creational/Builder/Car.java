package DesignPatterns.Creational.Builder;

public abstract class Car {
    private Engine engine;
    private int seats;
    private String drive;

    public Car(Engine engine, int seats, String drive) {
        this.engine = engine;
        this.seats = seats;
        this.drive = drive;
    }

    public Car() {
    }

    abstract void drive();
    public Engine getEngine() {
        return engine;
    }

    public String getDrive() {
        return drive;
    }

    public int getSeats() {
        return seats;
    }



    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }
}
