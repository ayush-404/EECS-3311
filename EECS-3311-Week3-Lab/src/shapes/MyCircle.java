package shapes;

import java.awt.*;

public class MyCircle extends Shape {

    private int top;
    private int left;
    private int radius;
    private Color shapeColor;

    public MyCircle(int left, int top, int radius, Color shapeColor) {
        this.left = left;
        this.top = top;
        this.radius = radius;
        this.shapeColor = shapeColor;
    }
    @Override
    public int compareTo(Shape o) {
        return (int) Math.ceil(this.getArea() - o.getArea());
    }

    @Override
    public void drawShape(Graphics form) {
        form.setColor(shapeColor);
        form.fillOval(this.left, this.top, this.radius*2, this.radius*2);
    }

    @Override
    public int getArea() {
        return (int) Math.PI * (radius * radius);
    }

    @Override
    public Shape copy() {
        return new MyCircle(this.left, this.top, this.radius, this.shapeColor);
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public Color getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
