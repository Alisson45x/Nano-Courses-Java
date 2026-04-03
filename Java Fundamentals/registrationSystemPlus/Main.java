package registrationSystemPlus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        ArrayList<Person> olderPeople = new ArrayList<Person>();
        ArrayList<Person> tallestPeople = new ArrayList<Person>();
        ArrayList<Person> lessThan18People = new ArrayList<Person>();

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            Person person = new Person();
            System.out.print("Name Person " + i + ": ");
            String name = sc.nextLine();
            person.setName(name);
            System.out.print("Age Person " + i + ": ");
            int age = sc.nextInt();
            sc.nextLine();
            person.setAge(age);
            System.out.print("Height Person " + i + ": ");
            Double height = sc.nextDouble();
            sc.nextLine();
            person.setHeight(height);
            people.add(person);

        }
        for (Person person : people) {
            person.data();
        }

        PersonService service = new PersonService();
        service.olderCalculation(people, olderPeople);

        service.heightCalculation(people, tallestPeople);

        service.lessThan18(people, lessThan18People);

        service.avarageHeight(people);
        
        service.upper(lessThan18People);

        
        sc.close();
    }
}
