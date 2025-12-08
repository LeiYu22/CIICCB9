import java.util.Scanner;
public class CountNumOfWords {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter a sentence: ");
        String sentence = in.nextLine();

        String[] words = sentence.trim().split("\\s+");
        
        System.out.println("Number of words: " +words.length);
    }
}