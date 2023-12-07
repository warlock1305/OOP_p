package labs.W6.LibraryInfoSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static labs.W6.LibraryInfoSystem.StringUtils.search;

public class Library{
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        this.books.add(book);
    }

    public void printBooks(){
        for(Book i: books){
            System.out.println(i.toString());
        }
    }

    public List<Book> searchByAuthor(String s){
        ArrayList<Book> found = new ArrayList<>();
        return books.stream()
                .filter(book -> search(s, book.name))
                .collect(Collectors.toList());
    }
}
