package DesignPatterns.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
    private List<User> users;

    public MediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User sender: users){
            if(sender != user){
                user.receivedMessage(message);
            }
        }
    }
}
