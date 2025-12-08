package eBULSApp;

import java.util.ArrayList;
import java.util.List;

public class eBULSAUserAuthentication {
    private static List<User> users = new ArrayList<>();
    private eBULSACheckBalance checkBalance;

    private static class User {
        int id;
        String name;
        String email;
        String number;
        int pin;

        public User(int id, String name, String email, String number, int pin) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.number = number;
            this.pin = pin;
        }
    }
    
    public eBULSAUserAuthentication(eBULSACheckBalance checkBalance) {
        this.checkBalance = checkBalance;
    }

    public void registration(String name, String email, String number, int pin) {
        if (name == null || email == null || number == null || String.valueOf(pin).length() != 4) {
            System.out.println("Registration failed: Invalid input. PIN must be 4 digits.");
            return;
        }

        // **Prevent duplicate email or number**
        for (User user : users) {
            if (user.email.equalsIgnoreCase(email)) {
                System.out.println("Registration failed: This email is already registered.");
                return;
            }
            if (user.number.equals(number)) {
                System.out.println("Registration failed: This mobile number is already registered.");
                return;
            }
        }
        
        int newId = users.size() + 1;
        users.add(new User(newId, name, email, number, pin));
        
        checkBalance.updateBalance(newId, 0.0);

        System.out.println("Registration successful. Your ID is: " + newId);
    }

    public int login(String email, int pin) {
        for (User user : users) {
            if (user.email.equalsIgnoreCase(email) && user.pin == pin) {
                System.out.println("Login successful.");
                return user.id;
            }
        }
        System.out.println("Login failed: Invalid email or PIN.");
        return -1;
    }
    
    public String getUserName(int userId) {
        for (User user : users) {
            if (user.id == userId) {
                return user.name;
            }
        }
        return "Unknown User";
    }

    public String getUserNumber(int userId) {
        for (User user : users) {
            if (user.id == userId) {
                return user.number;
            }
        }
        return "Unknown Number";
    }
    
    public void changePin(int userId, int oldPin, int newPin) {
        for (User user : users) {
            if (user.id == userId && user.pin == oldPin) {
                user.pin = newPin;
                System.out.println("PIN changed successfully.");
                return;
            }
        }
        System.out.println("Failed to change PIN: Invalid user ID or old PIN.");
    }

    public void logout() {
        System.out.println("User logged out.");
    }
    
    public boolean userExists(int userId) {
        for (User user : users) {
            if (user.id == userId) {
                return true;
            }
        }
        return false;
    }
}