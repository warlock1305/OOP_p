package labs;
import labs.L2t7;

public class L2t8 {
    public static void drawStarsPiramid(int n){
        for(int i = 1; i <= n; i++){
            L2t7.printStars(i);
        }
    }

    public static void main(String[] args){
        drawStarsPiramid(5);
    }
}
