package org.Temirjohn.Online_Payment_Gateway.transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionLogger {
    private static TransactionLogger instance;
    private final List<Transaction> transactions;

    private TransactionLogger() {
        transactions = new ArrayList<>();
    }

    public static synchronized TransactionLogger getInstance() {
        if (instance == null) {
            instance = new TransactionLogger();
        }
        return instance;
    }

    public void logTransaction(double amount, TransactionStatus status, String description) {
        transactions.add(new Transaction(amount, status, description));
    }

    public List<Transaction> getTransactionHistory() {
        return new ArrayList<>(transactions);
    }
}
