package DesignPatterns.Structural.Flyweight;

public class Tree {
    private int x;
    private int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw(){
        System.out.println("Draw tree. X: " + x + " Y: " + y + " Type: "
                + treeType.getName() + " Color: " + treeType.getColor());
    }
}
