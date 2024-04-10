package DesignPatterns.Behavioral.TemplateMethod;

public abstract class HouseBuilder {

    public final void build(){
        buildFoundation();
        buildWalls();
        buildRoof();
    }

    protected abstract void buildFoundation();
    protected abstract void buildWalls();
    protected abstract void buildRoof();
}
