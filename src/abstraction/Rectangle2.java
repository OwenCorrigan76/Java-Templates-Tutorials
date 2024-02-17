package abstraction;

// If we declare Rectangle abstract, the burden of implementing
// Shapes methods would be pushed to a subclass of Rectangle.

public class Rectangle2 extends Shape{

    private double length;
    private double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
