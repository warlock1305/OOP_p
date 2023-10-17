package labs;

public class L2t7 {
    public static void printStars(int n){
        for(int i = 1; i <= n; i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        printStars(12);
        printStars(2);
        printStars(15);
    }
}
