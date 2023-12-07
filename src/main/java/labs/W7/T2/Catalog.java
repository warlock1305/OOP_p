package labs.W7.T2;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Optional;

public class Catalog {
    private final List<Book> books;

    public Catalog(List<Book> books) {
        this.books = books;
    }

    public Optional<Book> isAvailable(String title) {
        return books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst()
                .filter(Book::available);
    }

    public Optional<String> aboutPresentBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.author().equals(author) && book.available())
                .findFirst()
                .map(Book::to_String);
    }

    public void updateStatus(String title, boolean status) {
        books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst()
                .ifPresent(book -> books.set(books.indexOf(book),new Book(book.title(), book.author(), book.pubyear(), status ) ));
    }
}

