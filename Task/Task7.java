import java.util.Scanner;

public class Task7 {

    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Warning: Division by zero attempted. Result may be Infinity or NaN.");
        }
        return num1 / num2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task7 calculator = new Task7();

        System.out.println("Welcome to the Simple Arithmetic Calculator!");

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("\nPerforming operations:");

        double sum = calculator.add(number1, number2);
        System.out.println("Addition: " + number1 + " + " + number2 + " = " + sum);

        double difference = calculator.subtract(number1, number2);
        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + difference);

        double product = calculator.multiply(number1, number2);
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + product);

        double quotient = calculator.divide(number1, number2);
        System.out.println("Division: " + number1 + " / " + number2 + " = " + quotient);

        scanner.close();
        System.out.println("\nThank you for using the calculator!");
    }
}

