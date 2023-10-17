package labs;
import java.util.Scanner;

public class L2_t2{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] s = {"first", "second", "third"};
		int ans = 0;
		for(String i:s){
			System.out.printf("Type %s number", i);
			ans += reader.nextInt();
		}
		System.out.printf("Sum of them is %d", ans);
	}
}
