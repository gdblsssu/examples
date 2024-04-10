package DesignPatterns.Behavioral.TemplateMethod;

public class Main {
    public static void main(String[] args){
        HouseBuilder wooden = new WoodenHouse();
        wooden.build();

        HouseBuilder stone = new StoneHouse();
        stone.build();
    }
}
