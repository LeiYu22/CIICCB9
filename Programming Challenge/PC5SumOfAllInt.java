import java.util.*;
public class PC5SumOfAllInt {
    public static void main(String[] args) {
        int num, total=0;

        Scanner in = new Scanner (System.in);

        System.out.println("Enter Number to Sum. Press 0 to stop");
        while (true){
            System.out.println("Enter a Number:");
            num = in.nextInt();

            if (num == 0){
                break;
            }

            total +=num;
        }
        System.out.println("Sum of Entered Numbers " + total);
    }
}