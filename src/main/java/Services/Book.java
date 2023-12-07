package Services;

public class Book implements ToBeStored{
    String writer;
    String name;
    double weight;

    public Book(String name, String writer, double weight){
        this.name = name;
        this.weight = weight;
        this.writer = writer;
    }
    @Override
    public double weight(){
        return this.weight;
    }

}
