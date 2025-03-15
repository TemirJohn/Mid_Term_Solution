package org.Temirjohn.Online_Payment_Gateway.transaction;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private final String id;
    private final double amount;
    private final TransactionStatus status;
    private final String description;
    private final LocalDateTime timestamp;

    public Transaction(double amount, TransactionStatus status, String description) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.status = status;
        this.description = description;
        this.timestamp = LocalDateTime.now();
    }

    public double getAmount() { return amount; }
    public TransactionStatus getStatus() { return status; }
    public String getDescription() { return description; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
