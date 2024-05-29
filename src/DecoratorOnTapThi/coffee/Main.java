package DecoratorOnTapThi.coffee;

public class Main {
    public static void main(String[] args) {
        // Nguyên tắc của decorator là bọc các object lại với nhau
        Coffee coffee = new MilkCoffee(new DefaultCoffee());
        Coffee coffee1 = new IceCoffee(new DefaultCoffee());
        System.out.println(coffee.getPrice());
        System.out.println(coffee1.getPrice());
    }
}
