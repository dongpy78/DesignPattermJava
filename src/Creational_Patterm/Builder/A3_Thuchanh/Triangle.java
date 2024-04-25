package Creational_Patterm.Builder.A3_Thuchanh;

public class Triangle extends Shape {
    private static Triangle triangle;

    public Triangle() {

    }

    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    @Override
    public String draw() {
        return null;
    }

    public static Triangle create() {
        if(triangle == null) triangle = new Triangle();
        return triangle;
    }
}
