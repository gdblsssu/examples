package DesignPatterns.Structural.Adapter;

public class SpellcheckerAdapter implements Printer{
    Spellchecker spellchecker;

    public SpellcheckerAdapter(Spellchecker spellchecker) {
        this.spellchecker = spellchecker;
    }

    @Override
    public void print(String text) {
        String checkText = spellchecker.spellchecking(text);
        print("Text: " + text);
    }
}
