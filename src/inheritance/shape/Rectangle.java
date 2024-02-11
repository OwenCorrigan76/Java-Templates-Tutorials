package inheritance.shape;

//******* also look up sealed classes in inheritance ********//
public class Rectangle {
    // private or final fields can't be overridden
    protected double length;
    protected double width;
    protected double sides = 4;

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

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double calculatePerimeter(){
        return (width * 2) + (length * 2);
    }
}
