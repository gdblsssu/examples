package DesignPatterns.Behavioral.State;

public class OffState implements FlashlightState {
    @Override
    public void switchState() {
        System.out.println("Фонарик выключен");
    }
}
