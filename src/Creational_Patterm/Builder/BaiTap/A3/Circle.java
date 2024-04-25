package Creational_Patterm.Builder.BaiTap.A3;

public class Circle extends Shape{
    private static Circle circle;

    public Circle() {
    }

    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return "Tron";
    }

    public static Circle create() {
        if(circle == null) circle = new Circle();
        return circle;
    }
}
