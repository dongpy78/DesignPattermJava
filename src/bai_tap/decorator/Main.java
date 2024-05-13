package bai_tap.decorator;

public class Main {
    public static void main(String[] args) {
        PC myPC = new ConcretePC("ASUS", "Intel i5", "8GB", "512GB SSD", "Full HD", 200, 300, 100, 150, 250);

        System.out.println(myPC.build());
        System.out.println(myPC.value());

        myPC = new UpdateRam(myPC, "16GB", 11);
        System.out.println(myPC.build());
        System.out.println(myPC.value());

        myPC = new UpdateCPU(myPC, "Cpu Vip pro", 23);
        System.out.println(myPC.build());
        System.out.println(myPC.value());
    }
}
