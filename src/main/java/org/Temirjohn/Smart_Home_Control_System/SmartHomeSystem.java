package org.Temirjohn.Smart_Home_Control_System;

import org.Temirjohn.Smart_Home_Control_System.Abstract_Factory.AdvancedSmartHomeFactory;
import org.Temirjohn.Smart_Home_Control_System.Abstract_Factory.BasicSmartHomeFactory;
import org.Temirjohn.Smart_Home_Control_System.Abstract_Factory.SmartHomeFactory;
import org.Temirjohn.Smart_Home_Control_System.Facade.SmartHomeFacade;
import java.util.Scanner;

public class SmartHomeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose Smart Home Version:");
            System.out.println("1. Basic");
            System.out.println("2. Advanced");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int versionChoice = scanner.nextInt();

            if (versionChoice == 3) {
                System.out.println("Exiting system...");
                scanner.close();
                return;
            }

            SmartHomeFactory factory;
            if (versionChoice == 1) {
                factory = new BasicSmartHomeFactory();
            } else {
                factory = new AdvancedSmartHomeFactory();
            }

            SmartHomeFacade home = new SmartHomeFacade();
            home.addDevice(factory.createLight());
            home.addDevice(factory.createSecurityCamera());
            home.addDevice(factory.createHeater());

            while (true) {
                System.out.println("\nSmart Home Control System");
                System.out.println("1. Turn ON all devices");
                System.out.println("2. Turn OFF all devices");
                System.out.println("3. Show device status");
                System.out.println("4. Back to main menu");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        home.turnOnAll();
                        break;
                    case 2:
                        home.turnOffAll();
                        break;
                    case 3:
                        home.showStatus();
                        break;
                    case 4:
                        System.out.println("Returning to main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice, try again.");
                }
                if (choice == 4) break;
            }
        }
    }
}