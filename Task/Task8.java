public class Task8 {

    // Method with variable arguments
    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            // Compute sum from 1 to num (inclusive)
            int sumUpToNum = num * (num + 1) / 2; // formula for sum of first n integers
            totalSum += sumUpToNum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int result = cumulativeSum(4, 5, 10); 
        System.out.println("Total cumulative sum: " + result);
    }
}
