package baitap_05_06.decorator.coffee;

public class MilkCoffee extends DecoratorCoffee{

    public MilkCoffee(Coffee cf) {
        super(cf);
    }

    private int decoratorWithMilk() {
        return 8000;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + decoratorWithMilk();
    }
}
