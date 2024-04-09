package DesignPatterns.Behavioral.Strategy;

public class TextEditor {
    private Strategy strategy;

    public TextEditor(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String edit(String text){
        return strategy.edit(text);
    }
}
