import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Welcome to the Largest Number Finder!");
        System.out.println("Please enter three integers to find the largest among them.");

        System.out.print("\nEnter the first number: ");
        int num1 = inputScanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = inputScanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = inputScanner.nextInt();

        inputScanner.close();

        if (num1 == num2 && num2 == num3) {
            System.out.println("\nAll numbers are equal.");
        }
        else if (num1 >= num2 && num1 >= num3) {
            System.out.println("\nThe Largest Number is: " + num1);
        }
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("\nThe Largest Number is: " + num2);
        }
        else {
            System.out.println("\nThe Largest Number is: " + num3);
        }

    }
}