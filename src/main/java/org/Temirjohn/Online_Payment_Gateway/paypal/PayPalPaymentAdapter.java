package org.Temirjohn.Online_Payment_Gateway.paypal;

import org.Temirjohn.Online_Payment_Gateway.payment.PaymentMethod;
import org.Temirjohn.Online_Payment_Gateway.transaction.TransactionResult;
import org.Temirjohn.Online_Payment_Gateway.transaction.TransactionStatus;

public class PayPalPaymentAdapter implements PaymentMethod {
    private ExternalPayPalService externalService;
    private String email;
    private String password;

    public PayPalPaymentAdapter(ExternalPayPalService externalService, String email, String password) {
        this.externalService = externalService;
        this.email = email;
        this.password = password;
    }

    @Override
    public TransactionResult processPayment(double amount) {
        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            return new TransactionResult(TransactionStatus.FAILED, "Invalid PayPal credentials");
        }
        boolean success = externalService.sendPayment(email, password, amount);
        if (success) {
            return new TransactionResult(TransactionStatus.COMPLETED, "PayPal payment successful");
        } else {
            return new TransactionResult(TransactionStatus.FAILED, "PayPal payment failed");
        }
    }
}
