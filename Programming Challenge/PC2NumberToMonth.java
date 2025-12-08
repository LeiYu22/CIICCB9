import java.util.*;

public class PC2NumberToMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Number to Month and Number of Days in that Month");
        System.out.print("Enter a Number 1-12: ");
        int month = in.nextInt();

        String monthName = "";
        int days = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                System.out.println("Note: Assuming a non-leap year. February can have 29 days in a leap year.");
                break;
        }

        if (days > 0) {
            String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            monthName = monthNames[month - 1];

            System.out.println("Month " + month + " is " + monthName);
            System.out.println("Number of Days: " + days);
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 12.");
        }
    }
}