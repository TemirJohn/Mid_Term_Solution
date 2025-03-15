package org.Temirjohn.Coffee_Shop_Simulator;

import org.Temirjohn.Coffee_Shop_Simulator.Coffee.Coffee;
import org.Temirjohn.Coffee_Shop_Simulator.CoffeeFactory.CoffeeFactory;
import org.Temirjohn.Coffee_Shop_Simulator.Decorator.*;

import java.util.*;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Available coffee types: Espresso, Cappuccino, Latte, Americano");
        System.out.print("Please select a coffee: ");
        String coffeeChoice = scanner.nextLine().trim();

        Coffee coffee;
        try {
            coffee = CoffeeFactory.createCoffee(coffeeChoice);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        Map<String, CoffeeDecorator> toppings = new HashMap<>();
        toppings.put("1", new MilkDecorator(coffee));
        toppings.put("2", new CaramelSyrupDecorator(coffee));
        toppings.put("3", new WhippedCreamDecorator(coffee));
        toppings.put("4", new ChocolateDecorator(coffee));

        System.out.println("\nAvailable toppings:");
        System.out.println("1. Milk\n2. Caramel Syrup\n3. Whipped Cream\n4. Chocolate Syrup");
        System.out.println("Enter the numbers of the toppings you want to add, separated by spaces (e.g., 1 3):");
        String[] selectedToppings = scanner.nextLine().trim().split(" ");

        for (String toppingNum : selectedToppings) {
            if (toppings.containsKey(toppingNum)) {
                coffee = toppings.get(toppingNum);
            } else {
                System.out.println("Ignoring unknown topping option: " + toppingNum);
            }
        }

        System.out.println("\nYour customized coffee:");
        System.out.println("Description: " + coffee.getDescription());
        System.out.printf("Total Cost: $%.2f\n", coffee.getCost());
    }
}
