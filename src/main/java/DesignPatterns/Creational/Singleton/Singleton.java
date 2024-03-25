package DesignPatterns.Creational.Singleton;

public class Singleton {
    private String value;
    private static Singleton instance;

    private Singleton(String value){
        this.value = value;
    }

    public static synchronized Singleton getInstance(String value){
        if(instance == null)
            instance = new Singleton(value);
        return instance;
    }


}
