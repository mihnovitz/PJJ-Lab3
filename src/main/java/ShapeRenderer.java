import java.util.List;

public class ShapeRenderer {

    public void renderShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            renderShape(shape);
        }
    }

    private void renderShape(Shape shape) {
        if (shape instanceof Rectangle) {
            drawRectangle((Rectangle) shape);
        } else if (shape instanceof Triangle) {
            drawTriangle((Triangle) shape);
        } else {
            System.out.println("Unknown shape: " + shape.getClass().getSimpleName());
        }
        System.out.println("Color: " + shape.getColorDescription());
        System.out.println();
    }

    private void drawRectangle(Rectangle rectangle) {
        System.out.println("Drawing Rectangle:");
        for (int i = 0; i < 4; i++) {
            System.out.println("########");
        }
    }

    private void drawTriangle(Triangle triangle) {
        System.out.println("Drawing Triangle:");
        System.out.println("    #");
        System.out.println("   ###");
        System.out.println("  #####");
        System.out.println(" #######");
    }
}