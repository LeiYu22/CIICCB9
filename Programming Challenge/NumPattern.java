import java.util.*;
public class NumPattern{
    public static void main (String[] args){
        int num;
        Scanner in = new Scanner (System.in);

        System.out.println("Enter a num: ");
        num = in.nextInt();

        for ( int i = 1 ; i<= num; i++ ){
            for (int j = 1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}