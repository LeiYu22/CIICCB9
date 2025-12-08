package Task121;

public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();

        date1.setDate(1, 1, 1978);
        date2.setDate(9, 21, 1984);

        System.out.println("Date 1: " + date1.toString());
        System.out.println("Date 2: " + date2.toString());

        DateTask.leapYears();
    }
}