package Structural_Patterm.Decorator.beverage;

public class Mocha extends CondimentDecoration{ // gia vị - mocha
    public Mocha(Beverage component, String description) {
        super(component, description);
    }

    @Override
    public int cost() {
        return component.cost() + 10000;
    }
}
