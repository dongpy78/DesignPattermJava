package Structural_Patterm.Decorator.beverage;

public abstract class Beverage { // đồ uống cơ bản
    protected String description;

    public Beverage(String description) {
        this.description = description;
    }

    public abstract int cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
