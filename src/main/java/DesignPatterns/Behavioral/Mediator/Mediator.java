package DesignPatterns.Behavioral.Mediator;

interface Mediator {
    void addUser(User user);
    void sendMessage(String message, User user);

}
