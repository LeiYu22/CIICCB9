import java.util.*;
public class ScoreToGrade{

    public static void main(String[] args) {
        
    
    int grade;

    Scanner in = new Scanner (System.in);

    System.out.print("Enter a Grade: ");
    grade = in.nextInt();
    
    if (grade<60)
        System.out.println(grade + " F Grade");

    else if (grade>=60 && grade <=69)
        System.out.println(grade + " D Grade");
   
    else if (grade>=70 && grade <=79)
        System.out.println(grade + " C Grade");
    
    else if(grade >= 80 && grade <=89)
    System.out.println(grade + " B Grade");
    
    else if (grade >=90 && grade <=100)
    System.out.println(grade + " A Grade");

    }
}