package baitap_05_06.decorator.coffee;

public abstract class DecoratorCoffee extends Coffee {
    Coffee cf;

    public DecoratorCoffee(Coffee cf) {
        this.cf = cf;
    }

    @Override
    public int getPrice() {
        return cf.getPrice();
    }
}
