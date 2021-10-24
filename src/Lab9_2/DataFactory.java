package Lab9_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    public static boolean saveBookList(List<Book> books, String path) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Book book : books) {
                String bookData = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthor();
                bufferedWriter.write(bookData);
                bufferedWriter.newLine();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public static List<Book> readBookList(String path) {
        List<Book> books = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String bookDataLine = bufferedReader.readLine();
            while (bookDataLine != null) {
                String[] bookData = bookDataLine.split(";");
                String ISBN = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                books.add(new Book(ISBN, title, author));
                bookDataLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return books;
    }
}
