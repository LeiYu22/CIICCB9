import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        if (b == 0) {
            System.err.println("Error: Cannot divide by zero.");
            return Float.NaN;
        }
        return (float)a / b;
    }

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 25;
        int num3 = 7;
        int num4 = 3;

        System.out.println("Result of " + num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println("Result of " + num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println("Result of " + num3 + " * " + num4 + " = " + multiply(num3, num4));
        System.out.println("Result of " + num1 + " / " + num3 + " = " + divide(num1, num3));
    }
}