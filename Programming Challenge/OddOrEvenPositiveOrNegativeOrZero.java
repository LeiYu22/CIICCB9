import java.util.*;
public class OddOrEvenPositiveOrNegativeOrZero{
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner (System.in);

        System.out.println("Enter a number: ");
        num = in.nextInt();

        if (num %2==0 && num >=1)
            System.out.println(num + " is Even and a positive number");
        else if (num %2!=0 && num >=1 )
            System.out.println(num + " is Odd and a positive number");

        else if (num %2==0 && num <0)
            System.out.println(num + " is Even and a negative number");
        else if (num %2!=0 && num <0 )
            System.out.println(num + " is Odd and a negative number");
        else
            System.out.println("Num is Zero");
    }
}