package DesignPatterns.Behavioral.State;

public class Main {
    public static void main(String[] args){
        Flashlight flashlight = new Flashlight(new OffState());
        flashlight.switchState();

        flashlight.setState(new OnState());
        flashlight.switchState();
        flashlight.setState(new FlashingState());
        flashlight.switchState();
    }
}
