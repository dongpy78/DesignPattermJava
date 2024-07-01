package baitap_06_06.decorator.maytinh;



public class Main {
    public static void main(String[] args) {
        PC pc = new ConcretePC("ASUS", "Intel i5", "8GB", "512GB SSD", "Full HD", 200, 300, 100, 150);
        System.out.println("Thong so may tinh ban dau: " + pc.build());

        System.out.println("Tong so tien cua may tinh: " + pc.value());

        System.out.println("Sau khi nang cap Ram: ");
        pc = new upgradeRam(pc, "24GB", 450);
        System.out.println(pc.build());
        System.out.println(pc.value());
    }
}
