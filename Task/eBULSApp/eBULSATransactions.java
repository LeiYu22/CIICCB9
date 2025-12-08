package eBULSApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class eBULSATransactions {
    private List<Transaction> allTransactions = new ArrayList<>();
    private int transactionIdCounter = 1;

    // Private inner class to represent a transaction record
    private static class Transaction {
        int id;
        double amount;
        String name;
        int accountId;
        String accountName;
        String accountNumber;
        double remainingBalance;
        Date date;
        String transferToName;
        String transferFromName;

        public Transaction(int id, double amount, String name, int accountId, String accountName, String accountNumber, double remainingBalance, Date date, String transferFromName, String transferToName) {
            this.id = id;
            this.amount = amount;
            this.name = name;
            this.accountId = accountId;
            this.accountName = accountName;
            this.accountNumber = accountNumber;
            this.remainingBalance = remainingBalance;
            this.date = date;
            this.transferFromName = transferFromName;
            this.transferToName = transferToName;
        }
    }

    // Updated addTransaction method with a simplified parameter list
    public void addTransaction(int accountId, String accountName, String accountNumber, double amount, String name, double remainingBalance, String transferFromName, String transferToName) {
        Transaction newTransaction = new Transaction(transactionIdCounter++, amount, name, accountId, accountName, accountNumber, remainingBalance, new Date(), transferFromName, transferToName);
        allTransactions.add(newTransaction);
    }

    public void viewAll() {
        System.out.println("\n--- All Transactions ---");
        if (allTransactions.isEmpty()) {
            System.out.println("No transactions to display.");
            return;
        }
        for (Transaction transaction : allTransactions) {
            printTransaction(transaction);
        }
    }

    public void viewByUser(int userId) {
        System.out.println("\n--- Transactions for User ID " + userId + " ---");
        boolean found = false;
        for (Transaction transaction : allTransactions) {
            if (transaction.accountId == userId) {
                printTransaction(transaction);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No transactions found for this user.");
        }
    }

    public void viewTransaction(int transactionId) {
        System.out.println("\n--- Transaction Details ---");
        for (Transaction transaction : allTransactions) {
            if (transaction.id == transactionId) {
                printTransaction(transaction);
                return;
            }
        }
        System.out.println("Transaction with ID " + transactionId + " not found.");
    }

    private void printTransaction(Transaction t) {
        System.out.printf("ID: %d | User Account: %s (%s) | Type: %s | Amount: %.2f | From: %s | To: %s | Date and Time: %s | Remaining Balance: %.2f\n",
                t.id, t.accountName, t.accountNumber, t.name, t.amount, t.transferFromName, t.transferToName, t.date.toString(), t.remainingBalance);
    }
}