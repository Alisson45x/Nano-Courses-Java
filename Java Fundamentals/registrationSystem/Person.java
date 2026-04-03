package registrationSystem;

public class Person {
    // Attributes
    private String name;
    private int age;

    // Default Constructor
    public Person() {
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

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display data method
    public void displayData() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

}
