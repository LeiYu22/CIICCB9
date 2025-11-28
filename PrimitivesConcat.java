public class PrimitivesConcat {
    public static void main(String[] args) {
        // Primitives
        byte b = 3;                // will be used in "H3110"
        short s = 1;               // part of "H3110"
        int i = 10;                // part of "H3110"
        float f = 2.0f;            // "2.0"
        char c1 = 'H';             // "H"
        char c2 = 'w';             // "w"
        char c3 = 'r';             // "r"
        char c4 = 'l';             // "l"
        char c5 = 'd';             // "d"
        boolean bool = true;       // "true"

        // Build the string
        String output = "" + c1 + b + s + s + i + " " 
                        + c2 + '0' + c3 + c4 + c5 + " " 
                        + f + " " + bool;

        // Print it
        System.out.println(output);
    }
}

