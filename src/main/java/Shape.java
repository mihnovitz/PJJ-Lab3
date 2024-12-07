public abstract class Shape {

    // abstract double getArea();
    // abstract double getPerimeter();

    private Color color;

    public Shape(Color color) {
        this.color = color;

    }

    public Color getColor() {
        return color;

    }

    public void setColor (Color color) {
        this.color = color;

    }

    abstract double getArea();
    abstract double getPerimeter();

    public String getColorDescription() {
        return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %d",
                color.red(), color.green(), color.blue(), color.alpha());


    }


}