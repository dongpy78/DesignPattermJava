package Creational_Patterm.Builder.A3_Thuchanh;

public abstract class Shape {
    private String brush;
    private String paper;
    private String frame;

    public abstract String draw();

    public Shape() {}

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "brush='" + brush + '\'' +
                ", paper='" + paper + '\'' +
                ", frame='" + frame + '\'' +
                '}';
    }
}
