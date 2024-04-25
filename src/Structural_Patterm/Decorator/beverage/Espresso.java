package Structural_Patterm.Decorator.beverage;

public class Espresso extends Beverage{ // đồ uống cơ bản - cafe rang xay
    public Espresso(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 60000;
    }
}
