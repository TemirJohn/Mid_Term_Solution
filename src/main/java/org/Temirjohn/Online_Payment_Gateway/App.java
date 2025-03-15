package org.Temirjohn.Online_Payment_Gateway;

import org.Temirjohn.Online_Payment_Gateway.payment.PaymentFactory;
import org.Temirjohn.Online_Payment_Gateway.payment.PaymentMethod;
import org.Temirjohn.Online_Payment_Gateway.payment.PaymentType;
import org.Temirjohn.Online_Payment_Gateway.transaction.Transaction;
import org.Temirjohn.Online_Payment_Gateway.transaction.TransactionLogger;
import org.Temirjohn.Online_Payment_Gateway.transaction.TransactionResult;
import org.Temirjohn.Online_Payment_Gateway.transaction.TransactionStatus;

import java.util.*;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static PaymentFactory factory = new PaymentFactory();
    private static TransactionLogger logger = TransactionLogger.getInstance();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Process Payment");
            System.out.println("2. View Transaction History");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    processPayment();
                    break;
                case 2:
                    viewTransactionHistory();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private static void processPayment() {
        System.out.println("Select payment type:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Crypto");
        int typeChoice = scanner.nextInt();
        scanner.nextLine();

        PaymentType type;
        switch (typeChoice) {
            case 1:
                type = PaymentType.CREDIT_CARD;
                break;
            case 2:
                type = PaymentType.PAYPAL;
                break;
            case 3:
                type = PaymentType.CRYPTO;
                break;
            default:
                System.out.println("Invalid type");
                return;
        }

        Map<String, String> details = new HashMap<>();
        switch (type) {
            case CREDIT_CARD:
                System.out.print("Enter card number: ");
                details.put("cardNumber", scanner.nextLine());
                System.out.print("Enter expiry (MM/YY): ");
                details.put("expiryDate", scanner.nextLine());
                System.out.print("Enter CVV: ");
                details.put("cvv", scanner.nextLine());
                break;
            case PAYPAL:
                System.out.print("Enter email: ");
                details.put("email", scanner.nextLine());
                System.out.print("Enter password: ");
                details.put("password", scanner.nextLine());
                break;
            case CRYPTO:
                System.out.print("Enter wallet address: ");
                details.put("walletAddress", scanner.nextLine());
                break;
        }

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        try {
            PaymentMethod paymentMethod = factory.createPaymentMethod(type, details);
            TransactionResult result = paymentMethod.processPayment(amount);
            System.out.println("Result: " + result.status() + " - " + result.message());
            logger.logTransaction(amount, result.status(), result.message());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            logger.logTransaction(amount, TransactionStatus.FAILED, "Error: " + e.getMessage());
        }
    }

    private static void viewTransactionHistory() {
        List<Transaction> transactions = logger.getTransactionHistory();
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        System.out.println("Transaction History:");
        for (Transaction t : transactions) {
            System.out.printf("[%s] Amount: %.2f, Status: %s, Desc: %s%n",
                    t.getTimestamp(), t.getAmount(), t.getStatus(), t.getDescription());
        }
    }
}
