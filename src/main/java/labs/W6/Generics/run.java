package labs.W6.Generics;

import java.util.ArrayList;
import java.util.List;
import java.lang.Number;


public class run {
    public static < T extends Number > void asd(List < T > list){
        double sumEven = 0;
        double sumOdd = 0;

        for(T number: list){
            if(number%2==0){
                sumEven += number.doubleValue();
            }
            else{
                sumOdd += number.doubleValue();
            }
        }

        System.out.println(sumEven);
        System.out.println(sumOdd);

        }
    }
}
