package shapes;

import java.awt.*;
import java.util.Random;

public class ShapeFactory {
    private static Random rand = new Random();
    private static int currPos;
    private ShapeFactory(int seed) {
        rand = new Random(seed);
    }


    public static MyRectangle createRectangle(int left, int top, int width, int height, Color color) {
        return new MyRectangle(left, top, width, height, color);
    }

    public static MyCircle createCircle(int left, int top, int radius, Color color) {
        return new MyCircle(left, top, radius, color);
    }

    public static MySquare createSquare(int left, int top, int size, Color color) {
        return new MySquare(left, top, size, color);
    }

    public static Shape createRandomShape() {
        if(currPos > 700)   currPos = 0;
        currPos += 130;
        int currWidth = Math.abs(rand.nextInt() % 120);
        currWidth = currWidth < 50 ? currWidth + 50 : currWidth;
        Color color = new Color(Math.abs(rand.nextInt() % 255) , Math.abs(rand.nextInt() % 255),
                Math.abs(rand.nextInt() % 255), 255);

        switch (currWidth % 3) {
            case 0 : {
                int currHeight = Math.abs(rand.nextInt() % 120);
                currHeight = currHeight < 50 ? currHeight + 50 : currHeight;
                return new MyRectangle(currPos, currPos, currWidth, currHeight, color);
            }
            case 1 : {
                return new MyCircle(currPos, currPos, currWidth / 2, color);
            }
            case 2 : {
                return new MySquare(currPos, currPos, currWidth, color);
            }
        }
        return null;
    }
}
