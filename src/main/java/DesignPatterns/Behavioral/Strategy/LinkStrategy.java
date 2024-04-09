package DesignPatterns.Behavioral.Strategy;

public class LinkStrategy implements Strategy {
    @Override
    public String edit(String text) {
        return "<a>" + text + "</a>";
    }
}
