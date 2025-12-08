public class TaskSheet113 {

    public static void main(String[] args) {
        int check_number = 10;
        String message;

        for (int i = 0; i < check_number; i++) {
            message = i + " " + ((i % 2 == 0) ? "is even number" : "is odd number");
            System.out.println(message);
        }
    }
}