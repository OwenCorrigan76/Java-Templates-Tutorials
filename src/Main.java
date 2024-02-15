
import Strings.ParseStrings;
import collections.*;
import inheritance.person.*;
import inheritance.shape.*;
import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;

public class Main {
    public static void main(String[] args) {

//**************Inheritance**************//
        Person person = new Person();
        Employee employee = new Employee();

        // add arguments because there's another constructor with these parameters
        Employee employee2 = new Employee("C22", "Manager");

        // we can now get getTitle from Person class
        System.out.println(employee.getTitle());

        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        // calling the method (super) and the @Overridden method (sub)
        rectangle.calculatePerimeter();
        square.calculatePerimeter();

//**************Polymorphism**************//
        // an object can have a superclass type and a subclass instance
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        // type animal but an instance of dog
        Animal sash = new Dog();
        sash.makeSound();

        // change sash to a cat to print meow
        sash = new Cat();
        sash.makeSound();

        // typecasting - upcasting dog to animal
        Animal dog = new Dog();

        // does not have access to dog specific methods like:
        // dog.fetch

        // this will work though as a downcast
        ((Dog) dog).fetch();

        // instanceOf helps check if an object is an instance of a class
        Animal sasha = new Dog();
        boolean isDog = sasha instanceof Animal;
        System.out.println(isDog);


//**************Collections**************//

        Sets sets = new Sets();
        // sets.addFruits();

        Lists lists = new Lists();
        // lists.myFruits();

        Queues queues = new Queues();
        // Queues.niceFruits();

        Maps maps = new Maps();
        // maps.addFruits();

        EnhancedForLoop enhancedForLoop = new EnhancedForLoop();
        // enhancedForLoop.loopTest();

        ForEachLambda forEachLambda = new ForEachLambda();
        // forEachLambda.testForeachLambda();

//**************Strings**************//

        ParseStrings strings = new ParseStrings();
        strings.parsing();
        strings.getWord();
        strings.getTheIndexOfWord();
        strings.testConcat();
        strings.testConcat2();
        strings.testConcat3();

    }

}
