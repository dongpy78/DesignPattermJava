package Creational_Patterm.Builder.A3_Thuchanh;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();
        Shape circle = shape.createShape(ShapeType.Circle, "a", "b", "c");
        Shape circle2 = shape.createShape(ShapeType.Circle, "f", "h", "v");



        System.out.println(circle.draw());
        System.out.println(circle2.draw());

    }
}
