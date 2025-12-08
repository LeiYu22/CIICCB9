public class TaskSheet161 {

    static class Customer {
        private String name;
        private int pin;
        private double balance;

        public Customer(String name, int pin, double initialBalance) {
            this.name = name;
            this.pin = pin;
            this.balance = initialBalance;
            System.out.println("New customer account created for " + this.name + ".");
        }

        public void checkBalance() {
            System.out.println("Checking balance for " + this.name + "...");
            System.out.println("Current balance: PHP " + String.format("%.2f", this.balance));
        }

        public void depositFunds(double amount) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Deposited PHP " + String.format("%.2f", amount) + " into " + this.name + "'s account.");
                System.out.println("New balance: PHP " + String.format("%.2f", this.balance));
            } else {
                System.out.println("Invalid deposit amount. Please enter a positive value.");
            }
        }

        public boolean authenticate(int enteredPin) {
            return this.pin == enteredPin;
        }
    }

    public static void main(String[] args) {
        Customer janeDoe = new Customer("Jane Doe", 1234, 500.00);
        System.out.println("----------------------------------------");

        int userPin = 1234;
        if (janeDoe.authenticate(userPin)) {
            System.out.println("Authentication successful.");
            System.out.println("----------------------------------------");

            janeDoe.checkBalance();
            System.out.println("----------------------------------------");

            double depositAmount = 250.75;
            janeDoe.depositFunds(depositAmount);
            System.out.println("----------------------------------------");

            janeDoe.checkBalance();
        } else {
            System.out.println("Authentication failed. Incorrect PIN.");
        }
    }
}