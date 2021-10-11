// Singleton class

package shapes;

import java.util.List;

public class InsertionSort {
    private InsertionSort uniqInstance = null;

    private InsertionSort() {}

    public InsertionSort getInstance() {
        if(uniqInstance == null) {
            uniqInstance = new InsertionSort();
        }
        return uniqInstance;
    }

    public static void sort(List<Shape> shapes) {
        for(int i = 1; i < 6; i++) {
            for(int j = i ; j > 0 ; j--) {
                if(shapes.get(j).getArea() < shapes.get(j-1).getArea()){
                    int top = shapes.get(j-1).getTop();
                    int left = shapes.get(j-1).getLeft();
                    shapes.get(j-1).setTop(shapes.get(j).getTop());
                    shapes.get(j-1).setLeft(shapes.get(j).getLeft());
                    shapes.get(j).setTop(top);
                    shapes.get(j).setLeft(left);
                    Shape temp = shapes.get(j-1);
                    shapes.set(j-1, shapes.get(j));
                    shapes.set(j, temp);
                }
            }
        }
    }
}
