package eBULSApp;

public class eBULSACashTransfer {
    private eBULSACheckBalance checkBalance;
    private eBULSATransactions transactions;
    private eBULSAUserAuthentication auth;

    public eBULSACashTransfer(eBULSACheckBalance checkBalance, eBULSATransactions transactions, eBULSAUserAuthentication auth) {
        this.checkBalance = checkBalance;
        this.transactions = transactions;
        this.auth = auth;
    }

    public void cashTransfer(int senderId, int receiverId, double amount) {
        if (amount <= 0) {
            System.out.println("Transfer failed: Amount must be positive.");
            return;
        }

        double senderBalance = checkBalance.checkBalance(senderId);
        if (senderBalance < amount) {
            System.out.println("Transfer failed: Insufficient balance.");
            return;
        }

        double receiverBalance = checkBalance.checkBalance(receiverId);

        // Update balances
        double newSenderBalance = senderBalance - amount;
        double newReceiverBalance = receiverBalance + amount;
        checkBalance.updateBalance(senderId, newSenderBalance);
        checkBalance.updateBalance(receiverId, newReceiverBalance);

        String senderName = auth.getUserName(senderId);
        String senderNumber = auth.getUserNumber(senderId);
        String receiverName = auth.getUserName(receiverId);
        String receiverNumber = auth.getUserNumber(receiverId);

        // Updated method calls to match the new addTransaction signature
        transactions.addTransaction(senderId, senderName, senderNumber, -amount, "Cash-transfer", newSenderBalance, senderName, receiverName);
        transactions.addTransaction(receiverId, receiverName, receiverNumber, amount, "Cash-transfer", newReceiverBalance, senderName, receiverName);

        System.out.println("Transfer of " + amount + " from user " + senderId + " to user " + receiverId + " successful.");
    }
}