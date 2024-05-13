package DecoratorOnTapThi.coffee;

public class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    private int decorateWithMilk() {
        return 8000;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + decorateWithMilk();
    }
}
