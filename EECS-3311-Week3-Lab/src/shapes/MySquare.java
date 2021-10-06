package shapes;

import java.awt.*;

public class MySquare extends Shape {

    private int top = 0;
    private int left = 0;
    private int size = 0;
    private Color shapeColor;

    public MySquare(int left, int top, int size, Color shapeColor) {
        this.setTop(top);
        this.setLeft(left);
        this.setSize(size);
        this.setShapeColor(shapeColor);
    }

    @Override
    public int compareTo(Shape o) {
        return this.getArea() - o.getArea();
    }

    @Override
    public void drawShape(Graphics form) {
        form.setColor(getShapeColor());
        form.fillRect(this.getLeft(), this.getTop(), this.getSize(), this.getSize());
    }

    @Override
    public int getArea() {
        return getSize() * getSize();
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape copy() {
        return new MySquare(this.left, this.top, this.size, shapeColor);
    }
}
