package registrationSystemPlus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Name Person " + i + ": ");
            String name = sc.nextLine();

            System.out.print("Age Person " + i + ": ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Height Person " + i + ": ");
            double height = sc.nextDouble();
            sc.nextLine();

            people.add(new Person(name, age, height));
        }

        System.out.println("\nAll people:");
        for (Person p : people) {
            System.out.println(p);
        }

        PersonService service = new PersonService();

        System.out.println("\n" + "-".repeat(40));
        System.out.println("Oldest people:");
        for (Person p : service.getOldestPeople(people)) {
            System.out.println(p);
        }

        System.out.println("\n" + "-".repeat(40));
        System.out.println("Tallest people:");
        for (Person p : service.getTallestPeople(people)) {
            System.out.println(p);
        }

        System.out.println("\n" + "-".repeat(40));
        System.out.println("People under 18:");
        var under18 = service.getUnder18(people);
        if (under18.isEmpty()) {
            System.out.println("There are no people under 18.");
        } else {
            for (Person p : under18) {
                System.out.println(p);
            }
        }

        System.out.println("\n" + "-".repeat(40));
        System.out.printf("Average height: %.2f\n", service.getAverageHeight(people));

        System.out.println("\n" + "-".repeat(40));
        System.out.println("Names in uppercase:");
        for (String name : service.getUpperNames(people)) {
            System.out.println(name);
        }

        System.out.println("\n" + "-".repeat(40));
        System.out.println("Reversed names:");
        for (String name : service.getReversedNames(people)) {
            System.out.println(name);
        }

        sc.close();
    }
}