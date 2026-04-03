package registrationSystemPlus;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person() {

    }

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void data() {
        System.out.print("Name: " + name + " | ");
        System.out.print("Age: " + age + " | ");
        System.out.print("Height: " + height + "\n");
    }

   
    
}
