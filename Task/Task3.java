public class Task3 {

    public static void main(String[] args) {

        String a = "Wow";
        String b = "Wow";
        String c = "Different";
        String d = "Wow!";

        boolean b1 = (a == b);
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure! Conditions not met.");
            System.out.println("b1: " + b1);
            System.out.println("b2: " + b2);
            System.out.println("b3: " + b3);
        }
    }
}