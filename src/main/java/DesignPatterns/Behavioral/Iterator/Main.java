package DesignPatterns.Behavioral.Iterator;

public class Main {
    public static void main(String[] args){
        String[] someArr = new String[]{"qwe", "asd", "zxc"};
        Iterator<String> iterator = new IteratorImpl(someArr);

        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
