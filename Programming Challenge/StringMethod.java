import java.util.Scanner;
public class StringMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter a String: ");
        String text = in.nextLine();

        int length = text.length();
        System.out.println("Length: " + length);

        String upper = text.toUpperCase();
        System.out.println("Uppercase: " + upper);

        String lower = text.toLowerCase();
        System.out.println("Lowercase: " + lower);

        char firstChar = text.charAt(0);
        System.out.println("First Character: "+ firstChar);

        char lastChar = text.charAt(text.length()-1);
        System.out.println("Last Character: "+ lastChar);
    }
}