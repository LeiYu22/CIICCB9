import java.util.*;

public class NumberToMonth {
    public static void main(String[] args) {
        int month;
        int days = -1;  // Initialize days

        Scanner in = new Scanner(System.in);

        System.out.println("Number to month and number of days in that month");

        System.out.print("Enter a Number 1-12: ");
        month = in.nextInt();

        switch (month) {
            case 1:
                System.out.println(month + " January");
                days = 31;
                break;
            case 2:
                System.out.println(month + " February");
                days = 28; // Assuming no leap year
                break;
            case 3:
                System.out.println(month + " March");
                days = 31;
                break;
            case 4:
                System.out.println(month + " April");
                days = 30;
                break;
            case 5:
                System.out.println(month + " May");
                days = 31;
                break;
            case 6:
                System.out.println(month + " June");
                days = 30;
                break;
            case 7:
                System.out.println(month + " July");
                days = 31;
                break;
            case 8:
                System.out.println(month + " August");
                days = 31;
                break;
            case 9:
                System.out.println(month + " September");
                days = 30;
                break;
            case 10:
                System.out.println(month + " October");
                days = 31;
                break;
            case 11:
                System.out.println(month + " November");
                days = 30;
                break;
            case 12:
                System.out.println(month + " December");
                days = 31;
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 12.");
                break;
        }

        if (days < 0)
            System.out.println("");
        else
            System.out.println("Number of Days: " + days);
    }
}