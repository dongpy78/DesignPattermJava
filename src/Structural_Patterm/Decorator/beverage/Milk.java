package Structural_Patterm.Decorator.beverage;

public class Milk extends CondimentDecoration{ // gia vị - sữa
    public Milk(Beverage component, String description) {
        super(component, description);
    }

    @Override
    public int cost() {
        return component.cost() + 7000;
    }
}
