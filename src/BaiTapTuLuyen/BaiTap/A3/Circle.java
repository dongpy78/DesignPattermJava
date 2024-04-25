package BaiTapTuLuyen.BaiTap.A3;

public class Circle extends Shape{
    private static Circle circle;
    public Circle() {
    }

    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return "a" + getBrush() + getFrame() + getPaper();
    }

    public static Circle create(String brush, String paper, String frame) {
        if(circle == null) circle = new Circle(brush,paper, frame );
        return circle;
    }
}
