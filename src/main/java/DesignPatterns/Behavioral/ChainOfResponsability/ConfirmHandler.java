package DesignPatterns.Behavioral.ChainOfResponsability;

import java.util.Random;

public class ConfirmHandler implements OrderHandler{
    OrderHandler next;

    public ConfirmHandler(OrderHandler next) {
        this.next = next;
    }

    @Override
    public void handle(Order order) {
        order.setId(new Random().nextInt());
        if(next != null)
            next.handle(order);
    }
}
