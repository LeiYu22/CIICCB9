import java.util.Scanner;
public class PC10CountNumOfWords {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter a Sentence: ");
        String sentence = in.nextLine();

        String[] words = sentence.trim().split("\\s+");
        
        System.out.println("Number of Words: " +words.length);
    }
}