package Lesson_07.Exercise_7_2;

public class Book {
    //Private Final Attributes
    private final String ISBN;
    private final String name;
    private final String author;

    //Private Constructor
    private Book(Builder builder) {
        this.ISBN = builder.ISBN;
        this.name = builder.name;
        this.author = builder.author;
    }

    //Service Methods
    public String getISBN() {
        return this.ISBN;
    }

    public void getBookInfo() {
        System.out.println("-------------------------");
        System.out.println("Book's ISBN: " + this.ISBN);
        System.out.println("Book's name: " + this.name);
        System.out.println("Book's auhtor: " + this.author);
        System.out.println("");
    }

    //Inner Static Class
    public static class Builder {
        private String ISBN;
        private String name;
        private String author;

        public String getISBN() {
            return ISBN;
        }

        public Builder ISBN(String ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
