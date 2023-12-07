package Services;
import java.util.*;

public class MaxWeightBox extends Box{
    int maxWeight;
    int crw;

    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.crw = 0;
    }
    public void add(Thing thing){
        if (crw + thing.getWeight() > maxWeight){
            System.out.println();
            throw new IllegalArgumentException();
        }
        else{
            contents.add(thing);
            maxWeight += thing.getWeight();
        }
    }

    public boolean isInTheBox(Thing thing){
        return contents.contains(thing);
    }

    List<Thing> contents = new ArrayList<Thing>();

}
