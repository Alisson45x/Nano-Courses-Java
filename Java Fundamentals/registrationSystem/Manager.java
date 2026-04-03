package registrationSystem;

public class Manager extends Employee {
    // Attributes
    private Double bonus;

    // Default Constructor
    public Manager() {
    }

    // getters and setters
    public double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    // Constructor
    public Manager(String name, int age, double salary, double bonus) {
        setName(name);
        setAge(age);
        setSalary(salary);
        this.bonus = bonus;
    }

    // display data method override
    @Override
    public void displayData() { 
        super.displayData();
        System.out.println("Bonus: " + getBonus());
        System.out.printf("Final Salary: " + (getSalary() +  bonus));
    }

}
