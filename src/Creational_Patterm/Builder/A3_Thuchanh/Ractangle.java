package Creational_Patterm.Builder.A3_Thuchanh;

public class Ractangle extends Shape{
    private static Ractangle ractangle;

    @Override
    public String draw() {
        return null;
    }

    public Ractangle() {}

    public Ractangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public static Ractangle create() {
        if(ractangle == null) {
            ractangle = new Ractangle();
        }
        return ractangle;
    }
}
