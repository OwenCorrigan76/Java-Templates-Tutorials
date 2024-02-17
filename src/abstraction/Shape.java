package abstraction;

// Class designed to be a template but not actually used as is.
// It is designed to be extended, not instantiated.
// ** NB It can be used to force a set of standards and expectations in a template.

public abstract class Shape {

    // An abstract method hasn't a body and only the method signature.
    // It is designed to be overwritten by a subclass.
    public abstract double calculateArea();

    // non-abstract methods can also be used.
    public void print(){
        System.out.println("I am a shape");
    }
}
