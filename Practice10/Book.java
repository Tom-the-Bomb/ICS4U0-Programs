public class Book {
    private String title;
    private Author author;
    private double price;

    public Book() {
        title = null;
        author = new Author();
        price = 0;
    }

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return String.format("\"%s\" by %s - $%.2f", title, author, price);
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book book = new Book(
            "Developing Java Software",
            new Author("Russel", "Winderand"),
            79.75
        );
        System.out.println(book);
    }
}