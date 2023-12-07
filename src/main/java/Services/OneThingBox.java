package Services;

import java.util.*;

public class OneThingBox extends Box{
    Thing thing;
    int num;
    public OneThingBox(){
    }
    public void add(Thing thing){
        if(num == 0){
            this.thing = thing;
        }
    }

    public boolean isInTheBox(Thing thing){
        return this.thing.equals(thing);
    }

}
