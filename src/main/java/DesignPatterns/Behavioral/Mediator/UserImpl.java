package DesignPatterns.Behavioral.Mediator;

public class UserImpl implements User {
    Mediator mediator;

    public UserImpl(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    String name;

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
        System.out.println("Sending a message from a user " + this + ": " + message);
    }

    @Override
    public void receivedMessage(String message) {
        System.out.println("Message received: " + message);
    }
}
