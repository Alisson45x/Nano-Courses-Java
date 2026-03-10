import java.util.Scanner;

public class Imcproject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Information about the person

        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        System.out.print("Weight: ");
        int weight = sc.nextInt();
        System.out.print("Do you practice exercises[Yes/No]: ");
        String pracExer = sc.next().toUpperCase();
        int energy = 100;

        // IMC

        double imc = weight / (height * height);

        // Informations Output

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println(String.format("\nIMC: " + "%.1f", imc));

        // Conditionals age

        if (age >= 18) {
            System.out.println("\nYou're of legal age.");
        } else {
            System.out.println("\nYou're of illegal age.");

        }

        // Conditionals imc

        if (imc > 25 || imc < 18.5) {
            System.out.println("Your IMC isn't health");
            energy -= 10;
        } else { 
            System.out.println("Your IMC is health");
            energy += 10;
        }

        // if practice exercises
    
        if (pracExer.startsWith("Y")) {
            System.out.println("You practice exercises");
            energy += 5;
        } else {
            System.out.println("You don't practice exercises");
            energy -= 5;
        }
            System.out.println("Your energy: " + energy);
            
        sc.close();
    }
}