package Creational_Patterm.Builder.BaiTap.A3;

public class ShapeFactory {
    public Shape createShape(ShapeType shape) {
        Shape shape1;
        switch (shape) {
            case Circle -> {
                return shape1 = Circle.create();
            }
            default -> {
                return null;
            }
        }
    }
}
