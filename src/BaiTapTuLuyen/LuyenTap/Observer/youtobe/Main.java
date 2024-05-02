package BaiTapTuLuyen.LuyenTap.Observer.youtobe;

public class Main {
    public static void main(String[] args) {
        Channel telko = new Channel();
        Subscriber s1 = new Subscriber("Kenh 1");
        Subscriber s2 = new Subscriber("Kenh 2");
        Subscriber s3 = new Subscriber("Kenh 3");
        Subscriber s4 = new Subscriber("Kenh 4");
        Subscriber s5 = new Subscriber("Kenh 5");

        telko.subcribe(s1);
        telko.subcribe(s2);
    }
}
