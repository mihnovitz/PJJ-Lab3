import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Zadanie 3
        // ShapeDescriber describer = new ShapeDescriber();

        // Rectangle rect = new Rectangle(3.0, 4.0, new Color(255, 0, 0, 255)); // Wymiary double, kolory int
        // Triangle tri = new Triangle(5.0, 12.0, 13.0, new Color(0, 255, 0, 255)); // Poprawione na int dla koloru
        // Rectangle largeRect = new Rectangle(10.0, 20.0, new Color(0, 0, 255, 128)); // Poprawione na int dla koloru

        // // Color Zolty = new Color(1,1,1);
        // // Color Braz = new Color(867867,2345,576);
        // // Color Fiolet = new Color(12525,23424,3132, 5);

        // // System.out.println(Zolty);
        // // System.out.println(Braz);
        // // System.out.println(Fiolet);

        // // System.out.println("Rectangle: ");
        // // System.out.println("Color: " + rect.getColor());
        // // System.out.println("Area: " + rect.getArea());
        // // System.out.println("Perimeter: " + rect.getPerimeter());

        // // System.out.println("\n ");
        // // System.out.println("Triangle: ");
        // // System.out.println("Color: " + tri.getColor());
        // // System.out.println("Area: " + tri.getArea());
        // // System.out.println("Perimeter: " + tri.getPerimeter());


        // describer.describe(rect);
        // describer.describe(tri);
        // describer.describe(largeRect);

        // describer.describe(rect);
        // describer.describe(tri);
        // describer.describe(largeRect);


        ShapeDescriber describer = new ShapeDescriber();
        ShapeRenderer renderer = new ShapeRenderer();

        // Tworzenie obiektów
        Rectangle rect1 = new Rectangle(3.0, 4.0, new Color(255, 0, 0, 255)); // Czerwony prostokąt
        Triangle tri1 = new Triangle(5.0, 12.0, 13.0, new Color(0, 255, 0, 255)); // Zielony trójkąt
        Rectangle rect2 = new Rectangle(10.0, 20.0, new Color(0, 0, 255, 128)); // Niebieski prostokąt

        // Lista figur
        List<Shape> shapes = new ArrayList<>();
        shapes.add(rect1);
        shapes.add(tri1);
        shapes.add(rect2);

        // Opis figur
        for (Shape shape : shapes) {
            describer.describe(shape);
        }

        // Renderowanie figur
        System.out.println("\nRendering shapes:");
        renderer.renderShapes(shapes);
    }
}