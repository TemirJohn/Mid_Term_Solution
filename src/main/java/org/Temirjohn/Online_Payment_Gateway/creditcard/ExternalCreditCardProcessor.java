package org.Temirjohn.Online_Payment_Gateway.creditcard;

public class ExternalCreditCardProcessor {
    public boolean charge(double amount, String cardNumber, String expiry, String cvv) {
        // Simulate processing with 80% success rate
        return Math.random() > 0.2;
    }
}
