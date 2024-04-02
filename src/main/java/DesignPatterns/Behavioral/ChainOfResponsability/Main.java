package DesignPatterns.Behavioral.ChainOfResponsability;

public class Main {

    public static void main(String[] args){
        OrderHandler dispatcher = new DispatchHandler(null);
        OrderHandler payment = new PaymentHandler(dispatcher);
        OrderHandler confirm = new ConfirmHandler(payment);

        confirm.handle(new Order());
    }



}
