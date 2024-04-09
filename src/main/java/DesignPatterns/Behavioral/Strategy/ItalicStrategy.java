package DesignPatterns.Behavioral.Strategy;

public class ItalicStrategy implements Strategy {
    @Override
    public String edit(String text) {
        return "<i>" + text + "</i>";
    }
}
