package Task11;

public class Tasks11 {

    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:");
        System.out.println(book1.toString());
        
        System.out.println("\nBook 2:");
        System.out.println(book2.toString());
        
        System.out.println("\nBook 3:");
        System.out.println(book3.toString());
    }
}