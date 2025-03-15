package org.Temirjohn.Online_Payment_Gateway.creditcard;


import org.Temirjohn.Online_Payment_Gateway.payment.PaymentMethod;
import org.Temirjohn.Online_Payment_Gateway.transaction.TransactionResult;
import org.Temirjohn.Online_Payment_Gateway.transaction.TransactionStatus;

public class CreditCardPayment implements PaymentMethod {
    private final String cardNumber;
    private final String expiryDate;
    private final String cvv;
    private final ExternalCreditCardProcessor processor;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.processor = new ExternalCreditCardProcessor();
    }

    public TransactionResult processPayment(double amount) {
        if (!CreditCardValidator.isValid(cardNumber, expiryDate, cvv)) {
            return new TransactionResult(TransactionStatus.FAILED, "Invalid card details");
        }
        boolean success = processor.charge(amount, cardNumber, expiryDate, cvv);
        return success
                ? new TransactionResult(TransactionStatus.COMPLETED, "Credit card payment successful")
                : new TransactionResult(TransactionStatus.FAILED, "Credit card payment failed");
    }
}
