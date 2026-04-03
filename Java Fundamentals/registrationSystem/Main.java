package registrationSystem;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Alisson", 18);
        me.displayData();

        Employee fernando = new Employee("Fernando", 20, 1800);
        fernando.displayData();

        Manager alex = new Manager("Alex", 31, 2000, 400);
        alex.displayData();
    }

}
