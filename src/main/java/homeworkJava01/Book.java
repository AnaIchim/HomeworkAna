package homeworkJava01;

public class Book {

    String name;
    int year;
    Author author;
    double price;

    public Book(String name, int year, Author author, double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public static void Library() {
        Author Mircea_Eliade = new Author("Mircea Eliade", "mircea.eliade@gmail.com");
        Book book1 = new Book("Maitreyi", 1933, Mircea_Eliade, 34);
        System.out.println("Book " + book1.getName() + " (" + book1.getPrice() + " RON)," + " by " + book1.author.name + ", published in " + book1.getYear());
    }
}
