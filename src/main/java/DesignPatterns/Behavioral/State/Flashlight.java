package DesignPatterns.Behavioral.State;

public class Flashlight {
    private FlashlightState state;

    public Flashlight(FlashlightState state) {
        this.state = state;
    }

    public void setState(FlashlightState state) {
        this.state = state;
    }

    public void switchState(){
        state.switchState();
    }
}
