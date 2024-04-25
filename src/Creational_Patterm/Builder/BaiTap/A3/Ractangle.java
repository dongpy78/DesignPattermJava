package Creational_Patterm.Builder.BaiTap.A3;

public class Ractangle extends Shape{


    public Ractangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return "hinh tron";
    }
}
