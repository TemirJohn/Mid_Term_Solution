package org.Temirjohn.Online_Payment_Gateway.payment;

import org.Temirjohn.Online_Payment_Gateway.Crypto.CryptoPayment;
import org.Temirjohn.Online_Payment_Gateway.creditcard.CreditCardPayment;
import org.Temirjohn.Online_Payment_Gateway.paypal.ExternalPayPalService;
import org.Temirjohn.Online_Payment_Gateway.paypal.PayPalPaymentAdapter;

import java.util.Map;

public class PaymentFactory {
    public PaymentMethod createPaymentMethod(PaymentType type, Map<String, String> details) {
        return switch (type) {
            case CREDIT_CARD -> new CreditCardPayment(
                    details.get("cardNumber"),
                    details.get("expiryDate"),
                    details.get("cvv"));
            case СREDIT_CARD -> null;
            case PAYPAL -> new PayPalPaymentAdapter(
                    new ExternalPayPalService(),
                    details.get("email"),
                    details.get("password"));
            case CRYPTO -> new CryptoPayment(details.get("walletAddress"));
                
        };
    }
}
