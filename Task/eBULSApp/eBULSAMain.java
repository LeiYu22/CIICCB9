package eBULSApp;

import java.util.Scanner;

public class eBULSAMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        eBULSACheckBalance balance = new eBULSACheckBalance();
        eBULSAUserAuthentication auth = new eBULSAUserAuthentication(balance);
        eBULSATransactions transactions = new eBULSATransactions();
        
        // Updated constructors to pass the auth object
        eBULSACashIn cashIn = new eBULSACashIn(balance, transactions, auth);
        eBULSACashTransfer cashTransfer = new eBULSACashTransfer(balance, transactions, auth);

        auth.registration("Levy", "levy@sample.com", "09151234567", 1234);
        
        int loggedInUserId = -1;

        while (true) {
            if (loggedInUserId == -1) {
                System.out.println("\n--- Welcome to GCashApp ---");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine();

                if (option == 1) {
                    System.out.print("Enter your email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter your PIN: ");
                    int pin = scanner.nextInt();
                    loggedInUserId = auth.login(email, pin);
                    
                    if (loggedInUserId != -1) {
                        String userName = auth.getUserName(loggedInUserId);
                        String userNumber = auth.getUserNumber(loggedInUserId);
                        double userBalance = balance.checkBalance(loggedInUserId);
                        System.out.printf("Welcome, %s (%s)! Your current balance is: %.2f\n", userName, userNumber, userBalance);
                    }
                } else if (option == 2) {
                    System.out.print("Enter your full name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter your mobile number: ");
                    String number = scanner.nextLine();
                    System.out.print("Create a 4-digit PIN: ");
                    int pin = scanner.nextInt();
                    auth.registration(name, email, number, pin);
                } else if (option == 3) {
                    System.out.println("Goodbye!");
                    break;
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            } else {
                System.out.println("\n--- Main Menu ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Cash-in");
                System.out.println("3. Cash-transfer");
                System.out.println("4. View My Transactions");
                System.out.println("5. Logout");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        double currentBalance = balance.checkBalance(loggedInUserId);
                        System.out.println("Your current balance is: " + currentBalance);
                        break;
                    case 2:
                        System.out.print("Enter amount to cash in: ");
                        double cashInAmount = scanner.nextDouble();
                        cashIn.cashIn(loggedInUserId, cashInAmount);
                        break;
                    case 3:
                        System.out.print("Enter recipient's user ID: ");
                        int receiverId = scanner.nextInt();
                        if (receiverId == loggedInUserId) {
                             System.out.println("You cannot transfer money to yourself.");
                             break;
                        }
                        if (!auth.userExists(receiverId)) {
                             System.out.println("Recipient with ID " + receiverId + " does not exist.");
                             break;
                        }
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = scanner.nextDouble();
                        cashTransfer.cashTransfer(loggedInUserId, receiverId, transferAmount);
                        break;
                    case 4:
                        transactions.viewByUser(loggedInUserId);
                        break;
                    case 5:
                        auth.logout();
                        loggedInUserId = -1;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
        scanner.close();
    }
}