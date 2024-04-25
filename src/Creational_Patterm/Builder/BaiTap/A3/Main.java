package Creational_Patterm.Builder.BaiTap.A3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();
        Shape circle = shape.createShape(ShapeType.Circle);
        circle.setBrush("Cirlce setBrush!");
        System.out.println(circle.draw());
    }
}
