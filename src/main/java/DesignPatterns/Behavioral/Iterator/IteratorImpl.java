package DesignPatterns.Behavioral.Iterator;

import java.util.NoSuchElementException;

public class IteratorImpl implements Iterator<String> {
    private String[] arr;
    private int pos;

    public IteratorImpl(String[] arr) {
        this.arr = arr;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < arr.length;
    }

    @Override
    public String next() {
        if(!hasNext())
            throw new NoSuchElementException("No more elements in the array");

        return arr[pos++];
    }
}
