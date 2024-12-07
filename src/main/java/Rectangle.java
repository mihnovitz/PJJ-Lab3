public class Rectangle extends Shape {

    private double a;
    private double b;


    public double getArea(){
        return (a*b);
    }

    public double getPerimeter(){
        return (2*a)+(2*b);
    }

    public Rectangle(double a, double b, Color color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
        this(2,5, new Color(0,0,0));

    }



}
