public record Color(int red, int green, int blue, int alpha) {

    public Color(int red, int green, int blue, int alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public Color(int red, int green, int blue) {
        this(red,green,blue,0);
    }

    @Override
    public String toString(){
        return String.format("(%d, %d, %d, %d)", red, green, blue, alpha);

    }

}