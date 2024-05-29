package DecoratorOnTapThi.coffee;

// Cái này tương ứng với Concrete Component
public class DefaultCoffee implements Coffee {
    @Override
    public int getPrice() {
        return 5000;
    }
}
