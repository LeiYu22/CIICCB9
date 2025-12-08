class TaskSheet112 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result;

        System.out.println("Simple Assignment with Arithmetic Operators");
        System.out.println("Values: a = " + a + ", b = " + b);

        // Simple Assignment
        result = a + b; // Addition
        System.out.println("a + b = " + result);

        result = a - b; // Subtraction
        System.out.println("a - b = " + result);

        result = a * b; // Multiplication
        System.out.println("a * b = " + result);

        result = a / b; // Division
        System.out.println("a / b = " + result);

        result = a % b; // Modulus (Remainder)
        System.out.println("a % b = " + result);

        System.out.println("\nCompound Assignments with Arithmetic Operators");
        a = 10;
        b = 5;
        System.out.println("Values: a = " + a + ", b = " + b);

        a += b; // Compound Addition (a = a + b; is equivalent to a += b;)
        System.out.println("a += b; (a = a + b): a = " + a);

        a -= b; // Compound Subtraction (a = a - b; is equivalent to a -= b;)
        System.out.println("a -= b; (a = a - b): a = " + a); 

        a *= b; // Compound Multiplication (a = a * b; is equivalent to a *= b;)
        System.out.println("a *= b; (a = a * b): a = " + a);

        a /= b; // Compound Division (a = a / b; is equivalent to a /= b;)
        System.out.println("a /= b; (a = a / b): a = " + a);

        a %= b; // Compound Modulus (a = a % b; is equivalent to a %= b;)
        System.out.println("a %= b; (a = a % b): a = " + a);
    }
}