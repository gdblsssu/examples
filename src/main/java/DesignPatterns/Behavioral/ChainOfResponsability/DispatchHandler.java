package DesignPatterns.Behavioral.ChainOfResponsability;

public class DispatchHandler implements OrderHandler{
    OrderHandler next;

    public DispatchHandler(OrderHandler next) {
        this.next = next;
    }

    @Override
    public void handle(Order order) {
        if(order.getId() != 0 && order.isPaid())
            order.setSent(true);

        if(next != null)
            next.handle(order);
    }
}
