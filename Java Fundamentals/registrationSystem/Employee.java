package registrationSystem;

public class Employee extends Person {
    // Attributes
    private double salary;

    // Default Constructor
    public Employee() {
    }

    // getters and setters
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Constructor
    public Employee(String name, int age, double salary){
        setName(name);
        setAge(age);
        this.salary = salary;
    }

    // Display data method, Override
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Salary: " + getSalary());
    }
    
}