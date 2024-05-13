package DecoratorOnTapThi.coffee;

public class IceCoffee extends CoffeeDecorator{
    public IceCoffee(Coffee coffee) {
        super(coffee);
    }

    private int decorateWithIce() {
        return 6000;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + decorateWithIce();
    }
}
