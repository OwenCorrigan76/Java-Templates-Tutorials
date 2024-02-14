package inheritance.person;

public class Employee extends Person {

    // private fields can't be inherited
    private String employeeId;
    private String title;

    public Employee(){
        //super references the constructor in the Super Class: Person
        // call to super must be first line in the subclass constructor
     super(/* in this case it's the empty constructor */);
    }

    public Employee(String employeeId,  String title){
        //super references the constructor with the fields
        super("owen", 33, "male");
        this.employeeId = employeeId;
        this.title = title;
    }

    // public methods can be inherited
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Employee e = new Employee();

    public static void test(Employee e){
        System.out.println(e.title);
    }
}
