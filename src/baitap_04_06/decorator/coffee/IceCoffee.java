package baitap_04_06.decorator.coffee;

public class IceCoffee extends DecoratorCoffee {
    public IceCoffee(Coffee cf) {
        super(cf);
    }

    private int decoratorWithIce() {
        return 7000;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + decoratorWithIce();
    }
}
