package eBULSApp;

public class eBULSACashIn {
    private eBULSACheckBalance checkBalance;
    private eBULSATransactions transactions;
    private eBULSAUserAuthentication auth;

    public eBULSACashIn(eBULSACheckBalance checkBalance, eBULSATransactions transactions, eBULSAUserAuthentication auth) {
        this.checkBalance = checkBalance;
        this.transactions = transactions;
        this.auth = auth;
    }

    public void cashIn(int userId, double amount) {
        if (amount <= 0) {
            System.out.println("Cash-in failed: Amount must be positive.");
            return;
        }

        double currentBalance = checkBalance.checkBalance(userId);
        double newBalance = currentBalance + amount;
        checkBalance.updateBalance(userId, newBalance);

        String userName = auth.getUserName(userId);
        String userNumber = auth.getUserNumber(userId);
        
        // Updated method call to match the new addTransaction signature
        transactions.addTransaction(userId, userName, userNumber, amount, "Cash-in", newBalance, "N/A", userName);

        System.out.println("Successfully cashed in " + amount + ". New balance is: " + newBalance);
    }
}