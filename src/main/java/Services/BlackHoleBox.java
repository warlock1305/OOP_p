package Services;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box{
    public BlackHoleBox(){}
    public void add(Thing thing){
        contents.add(thing);
    }
    List<Thing> contents = new ArrayList<Thing>();

    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
