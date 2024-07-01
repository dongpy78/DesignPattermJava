package baitap_05_06.observer.CA3;

public class Main {
    public static void main(String[] args) {
        TiGia tiGia = new TiGia();
        NhaDauTuA nhaDauTuA = new NhaDauTuA();
        NhaDauTuB nhaDauTuB = new NhaDauTuB();

        nhaDauTuA.attach(tiGia);
        nhaDauTuB.attach(tiGia);
        System.out.println("Lần 1:");
        nhaDauTuA.update(3);
        nhaDauTuB.update(5);
        System.out.println("Lần 2:");
        nhaDauTuA.update(-3);
        nhaDauTuB.update(-5);
    }
}
