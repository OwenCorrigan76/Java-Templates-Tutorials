package inheritance.person;

// person clas with name, age and gender fields

public class Person {
    String name;
    int age;
    String gender;

    // A super class' constructor is called before the constructor of a subclass
    // If a super class doesn't have a default constructor, on its other
    // constructors must be called
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person(){

    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
