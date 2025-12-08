import java.util.*;

public class PC1ScoreToGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Grading Scale ---");
        System.out.println("A: 90 and above");
        System.out.println("B: 80 - 89");
        System.out.println("C: 70 - 79");
        System.out.println("D: 60 - 69");
        System.out.println("F: Below 60");
        System.out.println("---------------------");
        System.out.println();

        System.out.print("Enter the Student's Score: ");

        try {
            int score = scanner.nextInt();

            String grade;
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("The student's grade is: " + grade);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid numerical score.");
        } finally {
            scanner.close();
        }
    }
}
