package eBULSApp;

import java.util.ArrayList;
import java.util.List;

public class eBULSACheckBalance {
    private static List<Balance> balances = new ArrayList<>();

    // Private inner class to hold balance data
    private static class Balance {
        int userId;
        double amount;

        public Balance(int userId, double amount) {
            this.userId = userId;
            this.amount = amount;
        }
    }

    public void addTemporaryData() {
        // Add some dummy data for initial users
        balances.add(new Balance(1, 1500.00));
        balances.add(new Balance(2, 500.00));
    }

    public double checkBalance(int userId) {
        for (Balance balance : balances) {
            if (balance.userId == userId) {
                return balance.amount;
            }
        }
        return 0.0; // Return 0.0 if user's balance is not found
    }

    public void updateBalance(int userId, double amount) {
        for (Balance balance : balances) {
            if (balance.userId == userId) {
                balance.amount = amount;
                return;
            }
        }
        // If user doesn't have a balance record, create one
        balances.add(new Balance(userId, amount));
    }
}