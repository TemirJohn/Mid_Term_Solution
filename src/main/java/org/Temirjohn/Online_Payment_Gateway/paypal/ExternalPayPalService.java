package org.Temirjohn.Online_Payment_Gateway.paypal;

public class ExternalPayPalService {
    public boolean sendPayment(String email, String password, double amount) {
        // Simulate API call with 75% success rate
        return Math.random() > 0.25;
    }
}
