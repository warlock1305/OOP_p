package labs.W7.T2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Book> booklist = new ArrayList<>();
        booklist.add(new Book("The path of Abai", "Mukhtar Auezov", 1942, false));
        booklist.add(new Book("I am legend", "Richard Matheson", 1954, true));
        booklist.add(new Book("The Green Mile", "Stephen King", 1996, true));
        booklist.add(new Book("The Dark Tower V: Wolves of the Calla", "Stephen King", 2003, false));

        Catalog catalog = new Catalog(booklist);

        System.out.println(catalog.isAvailable("The Green Mile"));
        System.out.println(catalog.isAvailable("The path of Abai"));

        System.out.println(catalog.aboutPresentBookByAuthor("Stephen King"));

        catalog.updateStatus("The Green Mile", false);
        System.out.println(catalog.aboutPresentBookByAuthor("Stephen King"));



    }
}
