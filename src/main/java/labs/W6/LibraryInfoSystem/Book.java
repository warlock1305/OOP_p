package labs.W6.LibraryInfoSystem;

public class Book {
    String name;
    String publisher;
    int year;

    public Book(String name, String publisher, int year){
        this.name = name;
        this.publisher = publisher;
        this.year = year;
    }

    public String toString(){
        return this.name + " " + this.publisher + " " + this.year;
    }



}
