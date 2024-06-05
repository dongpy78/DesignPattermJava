package baitap_04_06.decorator.coffee;

public class Main {
    public static void main(String[] args) {
        Coffee cf = new MilkCoffee(new DefaultCoffee());
        Coffee cf2 = new IceCoffee(new DefaultCoffee());
        System.out.println(cf.getPrice());
        System.out.println(cf2.getPrice());
    }
}
