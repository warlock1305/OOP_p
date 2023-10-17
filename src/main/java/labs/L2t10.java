package labs;
import java.util.Random;
import java.util.Scanner;

public class L2t10 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner reader = new Scanner(System.in);

        int ans = random.nextInt(100);
        int n = reader.nextInt();
        while(n != ans){
            if(ans < n){
                System.out.println("Smaller");
            }
            else{
                System.out.println("Bigger");
            }
            n = reader.nextInt();
        }
        System.out.println("Finally, YOU GUESSED THE NUMBER!!!");
    }
}
