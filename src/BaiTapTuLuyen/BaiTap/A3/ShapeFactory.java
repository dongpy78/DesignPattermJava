package BaiTapTuLuyen.BaiTap.A3;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType, String brush, String paper, String frame) {
        Shape shape;
        switch (shapeType) {
            case Circle -> {
                return shape = Circle.create(brush, paper, frame);
            }
        }
        return null;
    }
}
