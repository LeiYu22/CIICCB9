import java.util.Scanner;
public class CheckVowelConsonant {

    public static boolean isVowel(char c) {
        c  = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ; 
    }

    public static boolean isConsonant(char c){
        return Character.isLetter(c) && !isVowel(c);
       
    }



    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter a Character: ");
        char x = in.next().charAt(0);

        if(isVowel(x)){
            System.out.println(x + " is a Vowel");
        }
        else if(isConsonant(x)){
            System.out.println(x + " is a Consonant");
        }
        else
        System.out.println("Invalid input");
    }
}