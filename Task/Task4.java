import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String inputString = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(inputString);

        String reversedString = stringBuilder.reverse().toString();

        if (inputString.toLowerCase().equals(reversedString.toLowerCase())) {
            System.out.println("The input string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The input string \"" + inputString + "\" is not a palindrome.");
        }

        scanner.close();
    }
}