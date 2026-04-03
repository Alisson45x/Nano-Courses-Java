package registrationSystemPlus;

import java.util.ArrayList;

public class PersonService {

    public void olderCalculation(ArrayList<Person> people, ArrayList<Person> olderPeople) {
        int max = 0;
        for (Person person : people) {
            if (person.getAge() > max) {
                max = person.getAge();
                olderPeople.clear();
                olderPeople.add(person);

            } else if (person.getAge() == max) {
                olderPeople.add(person);
            }
        }

        System.out.println("-".repeat(40) + "\nThe oldest people: ");
        for (Person person : olderPeople) {
            person.data();
        }

    }

    public void heightCalculation(ArrayList<Person> people, ArrayList<Person> tallestPeople) {
        Double maxHigh = 0.0;
        for (Person person : people) {
            if (person.getHeight() > maxHigh) {
                maxHigh = person.getHeight();
                tallestPeople.clear();
                tallestPeople.add(person);

            } else if (person.getHeight() == maxHigh) {
                tallestPeople.add(person);
            }
        }
        System.out.println("-".repeat(40) + "\nThe tallest people: ");
        for (Person person : tallestPeople) {
            person.data();
        }
        System.out.println("-".repeat(40));
    }

    public void lessThan18(ArrayList<Person> people, ArrayList<Person> lessThan18People) {
        for (Person person : people) {
            if (person.getAge() < 18) {
                lessThan18People.add(person);
            }
        }
        if (lessThan18People.size() > 0) {
            System.out.println("-".repeat(40) + "\nPeople that have less than 18:");
            for (Person person : lessThan18People) {
                person.data();
            }
        } else
            System.out.println("-".repeat(40));
        System.out.println("Don't have people less than 18 yers old.");
    }

    public void avarageHeight(ArrayList<Person> people) {
        Double avarageHeight = 0.0;
        int division = 0;
        for (Person person : people) {
            avarageHeight += person.getHeight();
            division++;
        }
        System.out.printf("-".repeat(40) + "\nThe average height is: %.2f",
                (avarageHeight / division));
    }

    public void upper(ArrayList<Person> people) {
        System.out.println("-".repeat(40) + "\nName upper case: ");
        for (Person person : people) {
            System.out.println("Name: " + person.getName().toUpperCase());
        }
    }

   public void reverse(ArrayList<Person> people){
    System.out.println("-".repeat(40) + "\nReversed name: ");

    for (Person person : people) {
        System.out.print("Name: ");

        String name = person.getName();

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

        System.out.println(); // quebra de linha
    }

    System.out.println("-".repeat(40));
}
}
