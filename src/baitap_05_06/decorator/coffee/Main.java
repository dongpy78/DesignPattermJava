package baitap_05_06.decorator.coffee;

public class Main {
    public static void main(String[] args) {
        Coffee cf1 = new MilkCoffee(new DefaultCoffee());
        Coffee cf2 = new IceCoffee(new DefaultCoffee());
        System.out.println(cf1.getPrice());
        System.out.println(cf2.getPrice());
    }
}
