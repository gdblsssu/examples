package DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Panel implements UIComponent {
    List<UIComponent> uiComponents = new ArrayList<>();

    public Panel(List<UIComponent> uiComponents) {
        this.uiComponents = uiComponents;
    }

    @Override
    public void draw() {
        System.out.println("Draw the panel");
        for(UIComponent component: uiComponents){
            component.draw();
        }
    }
}
