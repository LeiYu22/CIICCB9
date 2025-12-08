import java.util.*;
public class NumberToDayOfTheWeek{
    public static void main(String[] args) {
        int day;

        Scanner in = new Scanner (System.in);

        System.out.println("Enter a Number between 1-7: ");
        day = in.nextInt();

        switch (day){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
                System.out.println("Invalid input!");
                break;
        }
            
    }
}