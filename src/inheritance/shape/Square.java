package inheritance.shape;

public class Square extends Rectangle{

    // using the same method that's in the super class with different
    // return values. @Override is added
    @Override
    public double calculatePerimeter(){
        return (sides  * length);
    }
}
