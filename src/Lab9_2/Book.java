package Lab9_2;

public class Book {
    //Private Attributes
    private String ISBN;
    private String title;
    private String author;

    //Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    //Getter - Setter
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Service Method
    public void getBookInfo() {
        System.out.println("------------------------------");
        System.out.println("Book's ISBN: " + this.ISBN);
        System.out.println("Book's title: " + this.title);
        System.out.println("Book's auhtor: " + this.author);
        System.out.println("");
    }
}
