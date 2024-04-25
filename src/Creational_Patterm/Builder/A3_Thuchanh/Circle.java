package Creational_Patterm.Builder.A3_Thuchanh;

public class Circle extends Shape{
    private static Circle circle;

    public Circle() {
    }

    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return "sdfsdf" + getBrush() + getPaper() + getFrame();
    }

    public static Circle create(String brush, String paper, String frame) {
        if(circle == null) circle = new Circle( brush,  paper,  frame);
        return circle;
    }
}
