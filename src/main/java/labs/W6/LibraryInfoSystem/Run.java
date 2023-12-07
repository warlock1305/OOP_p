package labs.W6.LibraryInfoSystem;


public class Run {
    public static void main(String[] args){
        Library booklist = new Library();

        booklist.addBook(new Book("The path of Abai", "Mukhtar Auezov", 1942));
        booklist.addBook(new Book("I am legend", "Richard Matheson", 1954));
        booklist.addBook(new Book("The Green Mile", "Stephen King", 1996));
        booklist.addBook(new Book("The Dark Tower V: Wolves of the Calla", "Stephen King", 2003));

        booklist.printBooks();

        System.out.println(booklist.searchByAuthor("   THe   "));

    }
}
