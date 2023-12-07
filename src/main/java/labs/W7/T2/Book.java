package labs.W7.T2;

import java.util.Optional;
import java.lang.String;

public record Book(String title, String author, int pubyear, boolean available) {
    public String to_String(){
        return this.title+ " " + this.author + " " + this.pubyear +" " + this.available;
    };
}
