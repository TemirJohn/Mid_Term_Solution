package org.Temirjohn.Online_Payment_Gateway.Crypto;

import org.Temirjohn.Online_Payment_Gateway.payment.PaymentMethod;
import org.Temirjohn.Online_Payment_Gateway.transaction.TransactionResult;
import org.Temirjohn.Online_Payment_Gateway.transaction.TransactionStatus;

public class CryptoPayment implements PaymentMethod {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public TransactionResult processPayment(double amount) {
        if (walletAddress == null || walletAddress.isEmpty()) {
            return new TransactionResult(TransactionStatus.FAILED, "Invalid wallet address");
        }
        // Simulate crypto transaction with 70% success rate
        boolean success = Math.random() > 0.3;
        if (success) {
            return new TransactionResult(TransactionStatus.COMPLETED, "Crypto payment successful");
        } else {
            return new TransactionResult(TransactionStatus.FAILED, "Crypto payment failed");
        }
    }
}
