package Store;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        // Scanner creation
        Scanner sc = new Scanner(System.in);

        // Product1 information
        System.out.print("Product1 name: ");
        String name = sc.nextLine();
        System.out.print("Product1 price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        Product product1 = new Product(name, price);

        // Product1 INFO
        product1.productInfo();

        // Product2 information
        System.out.print("Product2 name: ");
        String name2 = sc.nextLine();
        System.out.print("Product2 price: ");
        double price2 = sc.nextDouble();
        Product product2 = new Product(name2, price2);

        // Product2 INFO
        product2.productInfo();

        // Add quantity
        System.out.print("Do you want to add the quatity?[Yes/No]");
        String addConditional = sc.next().toUpperCase();

        //Promotion ask
        System.out.println("Have promotion today?[Yes/No] ");
        boolean promotion = sc.next().toUpperCase().startsWith("Y");

        // Add Conditional
        if (addConditional.startsWith("Y")) {
            System.out.print("What product do you want to add?[1/2/Both] ");
            String productConditional = sc.next().toUpperCase();

            // Product Conditional
            // if chose 1
            if (productConditional.startsWith("1")) {
                System.out.print("How much do you want to add to product1: ");
                int amount = sc.nextInt();
                product1.addProducts(amount, promotion);

                // If chose 1
            } else if (productConditional.startsWith("2")) {
                System.out.print("How much do you want to add to product2: ");
                int amount = sc.nextInt();
                product2.addProducts(amount, promotion);

                // if chose both
            } else if (productConditional.equals("BOTH")) {

                System.out.print("How much do you want to add to product1: ");
                int amount1 = sc.nextInt();
                product1.addProducts(amount1, promotion);

                System.out.print("How much do you want to add to product2: ");
                int amount2 = sc.nextInt();
                product2.addProducts(amount2, promotion);

                // else for invalid options
            } else {
                System.out.println("Invalid option.");
            }

            // Product1 INFO
            product1.productInfo();

            // Product2 INFO
            product2.productInfo();

        }
        // Remove quantity
        System.out.print("Do you want to remove the quatity?[Yes/No]");
        String removeConditional = sc.next().toUpperCase();

        // Remove Conditional
        if (removeConditional.startsWith("Y")) {
            System.out.print("What product do you want to remove?[1/2/Both] ");
            String productConditional = sc.next().toUpperCase();

            // Product Conditional
            // if chose 1
            if (productConditional.startsWith("1")) {
                System.out.print("How much do you want to remove to product1: ");
                int amount = sc.nextInt();
                product1.removeProducts(amount);

                // If chose 1
            } else if (productConditional.startsWith("2")) {
                System.out.print("How much do you want to remove to product2: ");
                int amount = sc.nextInt();
                product2.removeProducts(amount);

                // if chose both
            } else if (productConditional.equals("BOTH")) {

                System.out.print("How much do you want to remove to product1: ");
                int amount1 = sc.nextInt();
                product1.removeProducts(amount1);

                System.out.print("How much do you want to remove to product2: ");
                int amount2 = sc.nextInt();
                product2.removeProducts(amount2);

                // else for invalid options
            } else {
                System.out.println("Invalid option.");
            }

        }
        // Product1 INFO
        product1.productInfo();

        // Product2 INFO
        product2.productInfo();

        // Scanner close
        sc.close();
    }
}
