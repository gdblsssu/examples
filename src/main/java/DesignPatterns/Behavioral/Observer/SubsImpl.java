package DesignPatterns.Behavioral.Observer;

public class SubsImpl implements Subs {
    String name;

    public SubsImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String context) {
        System.out.println(name + " got a new post: " + context);
    }
}
