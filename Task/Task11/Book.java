package Task11;

public class Book {

    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + this.title + "\"" +
               "\nAuthor: \"" + this.author + "\"" +
               "\nYear Published: " + this.yearPublished +
               "\nPrice: $" + String.format("%.2f", this.price);
    }
}