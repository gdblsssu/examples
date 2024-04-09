package DesignPatterns.Behavioral.Strategy;

public class BoldStrategy implements Strategy {
    @Override
    public String edit(String text) {
        return "<b>" + text + "</b>";
    }
}
