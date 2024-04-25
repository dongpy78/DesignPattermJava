package Structural_Patterm.Decorator.beverage;

public class DarkRoast extends Beverage{ // đồ uống cơ bản - cafe đen
    public DarkRoast(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 20000;
    }
}
