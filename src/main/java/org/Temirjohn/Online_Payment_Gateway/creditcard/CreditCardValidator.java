package org.Temirjohn.Online_Payment_Gateway.creditcard;

public class CreditCardValidator {
    public static boolean isValid(String cardNumber, String expiry, String cvv) {
        cardNumber = cardNumber.replaceAll("\\s+", "");
        return cardNumber != null && cardNumber.length() == 16 &&
                expiry.matches("\\d{2}/\\d{2}") &&
                cvv != null && cvv.length() == 3;
    }
}
