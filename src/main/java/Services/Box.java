package Services;

import java.lang.reflect.GenericArrayType;
import java.util.*;

public abstract class Box {
    public abstract void add(Thing thing);
    public void add(Collection<Thing> list){
        for(Thing each: list){
            add(each);
        }
    }

    public abstract boolean isInTheBox(Thing thing);
}