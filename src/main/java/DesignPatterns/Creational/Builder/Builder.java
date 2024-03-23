package DesignPatterns.Creational.Builder;

public interface Builder {
    void setEngine(Engine engine);
    void setSeats(int seats);
    void setDrive(String drive);
    Car build();
}
