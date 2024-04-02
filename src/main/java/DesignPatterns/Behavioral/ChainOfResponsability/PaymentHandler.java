package DesignPatterns.Behavioral.ChainOfResponsability;

import java.util.Random;

public class PaymentHandler implements OrderHandler{
    OrderHandler next;

    public PaymentHandler(OrderHandler next) {
        this.next = next;
    }

    @Override
    public void handle(Order order) {
        if(new Random().nextInt() % 2 == 0)
            System.out.println("Order has been paid");
        else {
            System.out.println("Order hasnt been paid");
        }

        if(next != null)
            next.handle(order);
    }
}
