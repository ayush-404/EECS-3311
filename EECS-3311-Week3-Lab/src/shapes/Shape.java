package shapes;
import java.awt.*;

public abstract class Shape implements Comparable<Shape>{
    private int top;
    private int left;
    private Color shapeColor;
    @Override
    public int compareTo(Shape o){return 0;};
    public void drawShape(Graphics form){};
    public int getArea(){return 0;};
    public Shape copy(){return this;};
    public void setTop(int top){};
    public void setLeft(int left){};
    public int getTop(){return 0;};
    public int getLeft(){return 0;};
}