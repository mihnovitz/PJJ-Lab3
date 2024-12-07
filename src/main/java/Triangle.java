public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public double getArea(){
        return (a*b)/2;
    }

    public double getPerimeter(){

        return a+b+c;
    }
    public Triangle(double a, double b, double c, Color color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {

        this(6,5, 10, new Color(0,0,0));

    }

}
