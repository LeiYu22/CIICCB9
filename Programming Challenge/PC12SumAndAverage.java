import java.util.Scanner;

public class PC12SumAndAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the Number of Elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " Integer Values:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        double average = (double) sum / n;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}