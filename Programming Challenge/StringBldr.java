import java.util.*;
public class StringBldr {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Enter a String at least 10 characters: ");
        String input = in.nextLine();

        while (input.length() < 10){
            System.out.print("Too Short :( , please enter again): ");
            input=in.nextLine();
        }   
        sb.append(input);
        System.out.println("Length " + sb.length());
        System.out.println("First Character: " + sb.charAt(0));
        System.out.println("Last Character: "+ sb.charAt(sb.length()-1));
        System.out.println("First Occurence of the letter 'a': " +sb.indexOf("a"));
        System.out.println("Substring of the string from index 3 - 6: " + sb.substring(3,6));
        System.out.println("Insert the string \"xyz\" at index 4: " + sb.insert(4, "xyz").toString());
        System.out.println("Delete the substring from index 2-4: "+ sb.delete(2,4));
        System.out.println("Delete the character at index 8: " + sb.deleteCharAt(8));
        System.out.println("Reverse String: " + sb.reverse());
        
    }
}