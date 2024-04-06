package DesignPatterns.Behavioral.Memento;

import java.util.Stack;

public class TextField {
    private String text;
    private int size;
    private String style;
    Stack<Memento> mementos = new Stack<>();

    public TextField() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void save(){
        mementos.push(new Memento(getText(), getSize(), getStyle()));
    }

    public void restore(){
        if(!mementos.isEmpty()){
            Memento last = mementos.pop();
            setText(last.getText());
            setSize(last.getSize());
            setStyle(last.getStyle());
        }
    }

    @Override
    public String toString() {
        return "TextField{" +
                "text='" + text + '\'' +
                ", size=" + size +
                ", style='" + style + '\'' +
                '}';
    }

    private class Memento{
        private String text;
        private int size;
        private String style;

        public Memento(String text, int size, String style) {
            this.text = text;
            this.size = size;
            this.style = style;
        }

        public String getText() {
            return text;
        }

        public int getSize() {
            return size;
        }

        public String getStyle() {
            return style;
        }
    }
}
