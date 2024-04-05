package DesignPatterns.Behavioral.Mediator;

public class Main {

    public static void main(String[] args){
        Mediator chatMediator = new MediatorImpl();
        User u1 = new UserImpl (chatMediator, "u1");
        User u2 = new UserImpl (chatMediator, "u2");

        chatMediator.addUser(u1);
        chatMediator.addUser(u2);

        u1.sendMessage("Hi");
        u2.sendMessage("Hi!");

    }
}
