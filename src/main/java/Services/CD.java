package Services;

public class CD implements ToBeStored{
    String artist;
    String title;
    int year;
    double weight;

    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.weight = 0.1;
    }

    public double weight(){
        return this.weight;
    }
}
