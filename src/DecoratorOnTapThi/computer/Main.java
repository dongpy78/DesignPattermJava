package DecoratorOnTapThi.computer;

public class Main {
    public static void main(String[] args) {
        // Create a base PC
        PC myPC = new ConcretePC("ASUS", "Intel i5", "8GB", "512GB SSD", "Full HD", 200, 300, 100, 150, 250);

        // Print base PC details and value
        System.out.println("Thông số máy tính: ");
        System.out.println(myPC.build());
        System.out.println("Tổng tiền: $" + myPC.value());

        // Upgrade RAM
        myPC = new UpgradeRam(myPC, "16GB", 200);

        // Print final upgraded PC details and value
        System.out.println("\nSau khi nâng cấp PC:");
        System.out.println(myPC.build());
        System.out.println("Tổng tiền: $" + myPC.value());
    }
}
