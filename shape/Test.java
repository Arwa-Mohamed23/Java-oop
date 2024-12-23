import java.util.ArrayList;
import java.util.List;

public class Test{
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape sh: shapes) {
            sh.draw();
        }
    }

    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle());
        shapes.add(new Circle());

        System.out.println("list Rectangles:");
        drawShapes(rectangles);
        
        System.out.println("list Shapes:");
        drawShapes(shapes);
    }
}
