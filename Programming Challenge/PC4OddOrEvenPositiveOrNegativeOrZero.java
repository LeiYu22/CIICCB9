import java.util.*;
public class PC4OddOrEvenPositiveOrNegativeOrZero{
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner (System.in);

        System.out.println("Enter a Number: ");
        num = in.nextInt();

        if (num %2==0 && num >=1)
            System.out.println(num + " is Even and a Positive Number");
        else if (num %2!=0 && num >=1 )
            System.out.println(num + " is Odd and a Positive Number");

        else if (num %2==0 && num <0)
            System.out.println(num + " is Even and a Negative Number");
        else if (num %2!=0 && num <0 )
            System.out.println(num + " is Odd and a Negative Number");
        else
            System.out.println("Number is Zero");
    }
}