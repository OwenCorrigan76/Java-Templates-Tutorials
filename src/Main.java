
import collections.*;
import inheritance.person.*;

public class Main {
    public static void main(String[] args) {

//**************Inheritance**************//
        Person person = new Person();
        Employee employee = new Employee();
        Employee employee2 = new Employee("C22", "Manager");

        // we can now get getTitle from Person class
        System.out.println(employee.getTitle());

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
    }
}
