package labs;
import java.util.Scanner;

public class L2t3{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int i = reader.nextInt();
        int sum = 0;
        while(i != 0){
            sum += i;
            System.out.printf("The sum is %d ", sum);
            i = reader.nextInt();
        }
        System.out.printf("In the end sum is %d ", sum);
    }
}
