package DesignPatterns.Creational.Builder;

public class CarBuilder implements Builder {
    Car car;
    @Override
    public void setEngine(Engine engine) {
        if(engine.power > 300){
            this.car = new SportCar();
        } else {
            this.car = new ElectricCar();
        }
        this.car.setEngine(engine);
    }

    @Override
    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    @Override
    public void setDrive(String drive) {
        car.setDrive(drive);
    }

    @Override
    public Car build() {
        return car ;
    }
}
