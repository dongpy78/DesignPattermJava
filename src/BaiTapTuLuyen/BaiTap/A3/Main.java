package BaiTapTuLuyen.BaiTap.A3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape(ShapeType.Circle, "a", "b", "d");
        Shape circle2 = shapeFactory.createShape(ShapeType.Circle, "a", "c", "e");
        System.out.println(circle.draw());
        System.out.println(circle2.draw());
    }
}

