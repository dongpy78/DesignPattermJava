package Structural_Patterm.Decorator.beverage;

public class Main {
    public static void main(String[] args) {
        Beverage drink = new DarkRoast("Dark Roast");
        System.out.println(drink.getDescription() + " - Cost: " + drink.cost());
        drink = new Milk(drink, "Dark Roast with Milk!");
        System.out.println(drink.getDescription() + " - Cost: " + drink.cost());
        drink = new Mocha(drink, "Dark Roast with Milk and Mocha!");
        System.out.println(drink.getDescription() + " - Cost: " + drink.cost());
    }
}
