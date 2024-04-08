package DesignPatterns.Behavioral.State;

public class FlashingState implements FlashlightState {
    @Override
    public void switchState() {
        System.out.println("Фонарик мигает");
    }
}
