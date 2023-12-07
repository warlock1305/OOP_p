package labs;
import Services.Box;
import Services.OneThingBox;
import Services.BlackHoleBox;
import Services.MaxWeightBox;
import Services.Thing;

public class L5 {
    Thing Ball = new Thing("Ball", 1);
    Box box = new MaxWeightBox(20);
    Box gift = new OneThingBox();
    Box pit = new BlackHoleBox();
    MaxWeightBox justBox = (MaxWeightBox)box;

    //etc.
}
