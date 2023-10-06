import coffee.Coffee;
import factory.BlendedCoffeeFactory;
import factory.CoffeeShopFactory;
import factory.HotCoffeeFactory;
import factory.IcedCoffeeFactory;

import java.util.Scanner;

public class Menu {

    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        //Creates coffee factories for each type
        CoffeeShopFactory blendedFactory = new BlendedCoffeeFactory();
        CoffeeShopFactory hotFactory = new HotCoffeeFactory();
        CoffeeShopFactory icedFactory = new IcedCoffeeFactory();

        while(true){
        System.out.println("\n************************************");
        System.out.println("        Welcome To Cafe Java        ");
        System.out.println("************************************");

        System.out.println("\nWhat type of coffee would you like to order?\n");

            System.out.println("1 - Blended Coffee");
            System.out.println("2 - Hot Coffee");
            System.out.println("3 - Iced Coffee");
            System.out.println("4 - Exit\n");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 4) {
                break;
            }

            String flavor = null;
            Coffee coffee = null;
            switch (choice) {
                case 1:
                    System.out.print("Enter flavor for Blended Coffee: ");
                    flavor = scanner.nextLine();
                    Coffee blendedCoffee = orderCoffee(blendedFactory, flavor);
                    serveCoffee(blendedCoffee);
                    break;
                case 2:
                    System.out.print("Enter flavor for Hot Coffee: ");
                    flavor = scanner.nextLine();
                    Coffee hotCoffee = orderCoffee(hotFactory, flavor);
                    serveCoffee(hotCoffee);
                    break;
                case 3:
                    System.out.print("Enter flavor for Iced Coffee: \n");
                    flavor = scanner.nextLine();
                    Coffee icedCoffee = orderCoffee(icedFactory, flavor);
                    serveCoffee(icedCoffee);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            assert flavor != null;
            if(flavor.contains("black")){
                System.out.println("The true breakfast of champions...");
            }
            System.out.println("Thank you for visiting the Cafe Java!");
            break;
        }


        // Close the scanner
        scanner.close();
        }

        public static Coffee orderCoffee(CoffeeShopFactory factory, String flavor) {
            Coffee coffee = factory.createCoffee(flavor);
            coffee.prepare();
            coffee.make();
            return coffee;
        }

        public static void serveCoffee(Coffee coffee) {
            coffee.serve();
        }

    }







