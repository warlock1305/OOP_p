package Services;
import java.util.*;

public class Thing{

    int weight;
    String name;

    public int getWeight(){
        return this.weight;
    }

    public Thing(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public boolean equals(Thing thing){
        return this.name.equals(thing.name);
    }

}
