package baitap_04_06.decorator.maytinh;

public class Main {
    public static void main(String[] args) {
        // Create a base PC
        PC myPC = new ConcrePC("ASUS", "Intel i5", "8GB", "512GB SSD", "Full HD", 200, 300, 100, 150, 250);

        System.out.println("Thông số máy tính");
        System.out.println(myPC.build());
        System.out.println("Tổng tiền: " + myPC.value());

        // Upgrade Ram
        myPC = new UpgradeRam(myPC, "16GB", 123);

        System.out.println("Sau khi nâng cấp PC:");
        System.out.println(myPC.build());
        System.out.println("Tổng tiền: $ " + myPC.value());
    }
}
