package Lab9_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private static String fileLocationPath = System.getProperty("user.dir") + "/Books.txt";
    private static List<Book> userBooksList = new ArrayList();
    private static List<Book> listBooksFromFile = DataFactory.readBookList(fileLocationPath);

    //Controllers
    private static void addBookByUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your book info: ");
        String bookISBN;
        do {
            System.out.print("Input book's ISBN with 10 digits: ");
            bookISBN = scanner.nextLine();             //Set ISBN by user input
        } while (bookISBN.length() != 10);             //ISBN must have only 10 digits
        System.out.print("Input book's title: ");
        String bookTitle = scanner.nextLine();         //Set Book's title by user input
        System.out.print("Input book's author: ");
        String bookAuthor = scanner.nextLine();        //Set Book's author by user input
        System.out.println("");
        userBooksList.add(new Book(bookISBN, bookTitle, bookAuthor));   //Add user inputted book to List<Book> bookList
    }

    private static void inputBookInfo(Book book) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input book's ISBN with 10 digits: ");
            book.setISBN(scanner.nextLine());             //Set ISBN by user input
        } while (book.getISBN().length() != 10);          //ISBN must have only 10 digits

        System.out.print("Input book's title: ");
        book.setTitle(scanner.nextLine());                //Set Book's title by user input
        System.out.print("Input book's author: ");
        book.setAuthor(scanner.nextLine());               //Set Book's author by user input
        System.out.println("");
    }

    private static void showAllBooksInputted() {
        System.out.println("------------------ List of books user inputted -------------------\n");
        int index = 1;
        for (Book currentBook : userBooksList) {
            System.out.println("Book number " + index);
            currentBook.getBookInfo();
            index++;
        }
    }

    private static void saveBooksIntoFile(List<Book> bookList, String fileLocationPath) {
        boolean isSavingSuccess = DataFactory.saveBookList(bookList, fileLocationPath);
        if (isSavingSuccess) {
            System.out.println("[INFO] Books saved into: " + fileLocationPath);
        } else {
            System.out.println("[ERR] Saving books: FAILED!!");
        }
    }

    private static void readBooksFromFile() {
        int index = 1;
        System.out.println("---------------------- List of books from file -----------------------\n");
        for (Book currentBook : listBooksFromFile) {
            System.out.println("Book number " + index++ + ": ");
            currentBook.getBookInfo();
        }
    }

    private static void searchBookByISBN() {
        Scanner scannerSearch = new Scanner(System.in);
        Book returnedBook = null;

        System.out.print("Input your search by ISBN: ");
        String searchISBN = scannerSearch.nextLine();
        System.out.println("------------------------------");
        System.out.println("Here is your search result: ");
        if (!searchISBN.isEmpty()) {
            for (Book currentBook : listBooksFromFile) {
                if (currentBook.getISBN().equals(searchISBN)) {
                    returnedBook = currentBook;
                    break;
                }
            }
        } else {
            System.out.println("You must input your search ISBN !!!");
        }

        if (returnedBook != null) {
            returnedBook.getBookInfo();
        } else {
            System.out.println("Book not found !!!");
        }
    }

    private static void updateBookFromFile() {
        Scanner scannerSearch = new Scanner(System.in);
        System.out.print("Input your search by ISBN: ");
        String searchISBN = scannerSearch.nextLine();
        System.out.println("------------------------------");
        System.out.println("Here is your search result: ");

        boolean isExisted = false;
        int size = listBooksFromFile.size();

        if (!searchISBN.isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (listBooksFromFile.get(i).getISBN().equals(searchISBN)) {
                    isExisted = true;
                    System.out.println("------------------------------");
                    System.out.println("I found it !\nPlease update your book info:");
                    inputBookInfo(listBooksFromFile.get(i));
                    saveBooksIntoFile(listBooksFromFile, fileLocationPath);
                    break;
                }
            }
        } else {
            System.out.println("You must input your search ISBN !!!");
        }

        if (!isExisted)
            System.out.println("Book not found !!!");
    }

    private static void deleteBookFromFile() {
        Scanner scannerSearch = new Scanner(System.in);
        Book returnedBook = null;
        boolean isExisted = false;
        int size = listBooksFromFile.size();

        System.out.print("Input your search by ISBN: ");
        String searchISBN = scannerSearch.nextLine();
        System.out.println("------------------------------");

        if (!searchISBN.isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (listBooksFromFile.get(i).getISBN().equals(searchISBN)) {
                    isExisted = true;
                    returnedBook = listBooksFromFile.get(i);
                    break;
                }
            }
        } else {
            System.out.println("You must input your search ISBN !!!");
        }

        if (isExisted && returnedBook != null) {
            listBooksFromFile.remove(returnedBook);
            System.out.println("Delete book with ISBN: " + searchISBN + " successfully !");
            saveBooksIntoFile(listBooksFromFile, fileLocationPath);
        } else {
            System.out.println("Book not found !!!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;
        int wrongOptionCounter = 0;

        while (isContinuing) {
            System.out.println("\n--------------------------- Book Menu ---------------------------\n");
            System.out.println("1/ Input book information");
            System.out.println("2/ Show all book information user inputted");
            System.out.println("3/ Save books into file");
            System.out.println("4/ Show all books from file");
            System.out.println("5/ Search book by ISBN");
            System.out.println("6/ Update book from file");
            System.out.println("7/ Delete book from file");
            System.out.println("8/ Exit program");
            System.out.println("\n--------------------------------------------------------------------\n");
            System.out.print("Please input your option: ");
            int userOption = scanner.nextInt();
            System.out.println("\n--------------------------------------------------------------------\n");

            if (wrongOptionCounter == 3) {
                System.out.println("You input wrong option 3 times!");
                System.out.println("See you again.");
                break;
            }
            switch (userOption) {
                case 1:
                    addBookByUser();
                    break;
                case 2:
                    showAllBooksInputted();
                    break;
                case 3:
                    saveBooksIntoFile(userBooksList, fileLocationPath);
                    break;
                case 4:
                    readBooksFromFile();
                    break;
                case 5:
                    searchBookByISBN();
                    break;
                case 6:
                    updateBookFromFile();
                    break;
                case 7:
                    deleteBookFromFile();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Wrong option ! Please try again");
                    wrongOptionCounter++;
            }
        }
    }
}
