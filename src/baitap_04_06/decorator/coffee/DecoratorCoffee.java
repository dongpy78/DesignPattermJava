package baitap_04_06.decorator.coffee;

public class DecoratorCoffee extends Coffee{
    private Coffee cf;

    public DecoratorCoffee(Coffee cf) {
        this.cf = cf;
    }

    @Override
    public int getPrice() {
        return cf.getPrice();
    }
}
