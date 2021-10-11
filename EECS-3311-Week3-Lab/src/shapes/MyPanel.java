package shapes;

import shapes.MyCircle;
import shapes.MyRectangle;
import shapes.Shape;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyPanel extends JPanel{
    private Graphics2D g2d;
    private List<Shape> shapes = new ArrayList<>();
    public MyPanel() {
        JButton createShapesButton = new JButton("Create Shapes");
        JButton sortShapesButton = new JButton("Sort Shapes");
        this.add(createShapesButton);
        this.add(sortShapesButton);
        createShapesButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        createShapes();
                        repaint();
                    }
                }
        );

        sortShapesButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        sortShapes();
                        repaint();
                    }
                }
        );
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2d = (Graphics2D) g;
        drawShapes();
    }

    public void createShapes() {
        shapes.clear();
        for(int i = 0 ; i < 6; i++) {
            shapes.add(ShapeFactory.createRandomShape());
        }
    }

    public void drawShapes() {
        for(Shape shape : shapes) {
            if(shape != null)
                shape.drawShape(g2d);
        }
    }

    public void sortShapes() {
        InsertionSort.sort(shapes);
    }

    public List<Shape> getShapes() {
        List<Shape> copiedShapes = new ArrayList<Shape>();
        for(int i = 0; i < 6 ; i++ ) {
            copiedShapes.add(shapes.get(i).copy());
        }
        return copiedShapes;
    }
}