package DesignPatterns.Behavioral.ChainOfResponsability;

public class Order {
    private int id;
    private boolean paid;
    private boolean sent;

    public int getId() {
        return id;
    }

    public boolean isPaid() {
        return paid;
    }

    public boolean isSent() {
        return sent;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public Order() {
    }

    public void setId(int id) {
        this.id = id;
    }
}
