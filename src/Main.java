
import generics.GenericsExample;
import strings.ParseStrings;
import exceptions.*;
import inheritance.shape.Rectangle;
import abstraction.Rectangle2;
import abstraction.Shape;
import collections.*;
import inheritance.person.*;
import inheritance.shape.*;
import interfaces.Book;
import interfaces.Product;
import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;
import varArgs.VarArgs;
import wildcards.Building;
import wildcards.House;
import wildcards.Office;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

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
//        square.calculatePerimeter();

//**************Polymorphism**************//

        // an object can have a superclass type and a subclass instance
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSound();

        // type animal but an instance of dog
        Animal sash = new Dog();
//        sash.makeSound();

        // change sash to a cat to print meow
        sash = new Cat();
//        sash.makeSound();

        // typecasting - upcasting dog to animal
        Animal dog = new Dog();

        // does not have access to dog specific methods like:
        // dog.fetch

        // this will work though as a downcast
//        ((Dog) dog).fetch();

        // instanceOf helps check if an object is an instance of a class
        Animal sasha = new Dog();
        boolean isDog = sasha instanceof Animal;
//        System.out.println(isDog);


//**************Abstraction**************//

        // can't create an instance of Shape but can of its subclass
        Shape rectangle2 = new Rectangle2(5, 7);
//        System.out.println("Area: " + rectangle2.calculateArea());

//**************Interfaces**************//

        Book book = new Book();
        book.setId("ABC");

//        System.out.println("Book Id: " + book.getId());

        // We can also create a Book object from Product
        Product book2 = new Book();

        // but we can't do this:
//         Product book2 = new Product();


//**************Collections**************//

        Sets sets = new Sets();
//         sets.addFruits();

        Lists lists = new Lists();
//         lists.myFruits();

        Queues queues = new Queues();
//         Queues.niceFruits();

        Maps maps = new Maps();
//         maps.addFruits();

        EnhancedForLoop enhancedForLoop = new EnhancedForLoop();
//         enhancedForLoop.loopTest();

        ForEachLambda forEachLambda = new ForEachLambda();
//         forEachLambda.testForeachLambda();

//**************Strings**************//

        ParseStrings strings = new ParseStrings();
//        strings.parsing();
//        strings.getWord();
//        strings.getTheIndexOfWord();
//        strings.testConcat();
//        strings.testCompare();
//        strings.testCompare2();
//        strings.endsWith();


//**************Exceptions**************//
        TryCatch tryCatch = new TryCatch();
//        tryCatch.tryFileMethod();

        // prove the program hasn't crashed
//        tryCatch.methodToProveProgramIsStillRunningAfterTryCatch();

        // print the stack trace of error
//        StackTrace stackTrace = new StackTrace();
//        stackTrace.printStackTrace();

        // test multiple exceptions
//        MultipleExceptions multipleExceptions = new MultipleExceptions();
//        multipleExceptions.multiple();

        // add finally to ensure code is run no matter if there's an e or not
        Finally f = new Finally();
//        f.multiple();

        // look at tryWithResources

        ThrowingExceptions throwingExceptions = new ThrowingExceptions();
        // hours myst be under 40
//        throwingExceptions.calculatePay(60, 50);
        // can't be negative
//        throwingExceptions.calculatePay(-2, -5);

        Rethrow rethrow = new Rethrow();
//        Rethrow.rethrowException();

//**************Generics**************//
        GenericsExample genericsExample = new GenericsExample();
//        genericsExample.testGenerics();

//**************VarArgs**************//
        VarArgs varArgs = new VarArgs();
//        varArgs.callArgs();


//**************Wildcards**************//
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        // can't do this because Office is not a subclass of Building without wildcards
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
        // this will work because House is a subclass of Building
        // and there is a wildcard in the method signature
        printBuildings(houses);
    }
// adding in ? extends Building allows us to pass in a list of any subclass of Building
    static void printBuildings(List<? extends Building> buildings) {
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
    }
}


