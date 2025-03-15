package org.Temirjohn.Online_Payment_Gateway.payment;

import org.Temirjohn.Online_Payment_Gateway.transaction.TransactionResult;

public interface PaymentMethod {
    TransactionResult processPayment(double amount);
}
