package registrationSystemPlus;

import java.util.ArrayList;

public class PersonService {

    public ArrayList<Person> getOldestPeople(ArrayList<Person> people) {
        ArrayList<Person> result = new ArrayList<>();
        int max = 0;

        for (Person p : people) {
            if (p.getAge() > max) {
                max = p.getAge();
                result.clear();
                result.add(p);
            } else if (p.getAge() == max) {
                result.add(p);
            }
        }
        return result;
    }

    public ArrayList<Person> getTallestPeople(ArrayList<Person> people) {
        ArrayList<Person> result = new ArrayList<>();
        double max = 0;

        for (Person p : people) {
            if (p.getHeight() > max) {
                max = p.getHeight();
                result.clear();
                result.add(p);
            } else if (p.getHeight() == max) {
                result.add(p);
            }
        }
        return result;
    }

    public ArrayList<Person> getUnder18(ArrayList<Person> people) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person p : people) {
            if (p.getAge() < 18) {
                result.add(p);
            }
        }
        return result;
    }

    public double getAverageHeight(ArrayList<Person> people) {
        double sum = 0;

        for (Person p : people) {
            sum += p.getHeight();
        }

        return sum / people.size();
    }

    public ArrayList<String> getUpperNames(ArrayList<Person> people) {
        ArrayList<String> result = new ArrayList<>();

        for (Person p : people) {
            result.add(p.getName().toUpperCase());
        }
        return result;
    }

    public ArrayList<String> getReversedNames(ArrayList<Person> people) {
        ArrayList<String> result = new ArrayList<>();

        for (Person p : people) {
            String name = p.getName();
            String reversed = "";

            for (int i = name.length() - 1; i >= 0; i--) {
                reversed += name.charAt(i);
            }

            result.add(reversed);
        }

        return result;
    }
}