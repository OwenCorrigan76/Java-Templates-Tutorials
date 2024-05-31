package abstraction;

public class Dog extends AnimalClass {
    String speak;
    int age;
    String name;

    public Dog (String speak, int age, String name){
        this.speak = speak;
        this.age = age;
        this.name = name;

    }

    public void makeSound() {
        System.out.println("Woof");
    }
    public void move() {
        System.out.println("Run");
    }
}
