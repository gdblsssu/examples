package DesignPatterns.Behavioral.State;

public class OnState implements FlashlightState {
    @Override
    public void switchState() {
        System.out.println("Фонарик горит");
    }
}
