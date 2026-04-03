import java.util.ArrayList;
import java.util.Scanner;

public class SystemName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Write a name: ");
            String name = sc.next();
            nameList.add(name);

        }
        System.out.print("Names:");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.print(" " + nameList.get(i));
        }
        System.out.print("Names with 5 or more letters:");
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).length() >= 5) {
                System.out.print(" " + nameList.get(i));
            }

        }
        System.out.print("\nNames that starts with A:");
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).toUpperCase().startsWith("A")) {
                System.out.print(" " + nameList.get(i));
            }
        }
        ArrayList<String> nameListMax = new ArrayList<String>();
        int max = nameList.get(0).length();

        for (int i = 1; i < nameList.size(); i++) {
            if (max < nameList.get(i).length()) {
                max = nameList.get(i).length();
                nameListMax.clear();
                nameListMax.add(nameList.get(i));
            } else if (nameList.get(i).length() == max) {
                nameListMax.add(nameList.get(i));
            }
        }
        System.out.println("\nThe names that has the highest quantity of letters is:");
        for (int i = 0; i < nameListMax.size(); i++) {
            System.out.println(nameListMax.get(i) + " with " + nameListMax.get(i).length() + " letters");
        }

        ArrayList<String> nameListMin = new ArrayList<String>();
        int min = nameList.get(0).length();

        for (int i = 1; i < nameList.size(); i++) {
            if (min > nameList.get(i).length()) {
                min = nameList.get(i).length();
                nameListMin.clear();
                nameListMin.add(nameList.get(i));
            } else if (nameList.get(i).length() == min) {
                nameListMin.add(nameList.get(i));
            }
        }
        System.out.println("\nThe names that has the lowest quantity of letters is:");
        for (int i = 0; i < nameListMin.size(); i++) {
            System.out.println(nameListMin.get(i) + " with " + nameListMin.get(i).length() + " letters");
        }
        System.out.print("Names UpperCase:");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.print(" " + nameList.get(i).toUpperCase());
        }
        System.out.print("\nReversed names:");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.print(" ");
            int letters = (nameList.get(i).length() - 1);
            for (;letters >= 0; letters--) {
                System.out.print(nameList.get(i).charAt(letters));
            }
        }

        sc.close();

    }
}
