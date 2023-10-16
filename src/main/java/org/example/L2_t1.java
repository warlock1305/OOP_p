import java.util.Scanner;

public class L2_t1
{
	public static void main(String[] args) {
		String password = "555ugotit";
        System.out.println("Type the password:");
        Scanner reader = new Scanner(System.in);
        String s = reader.nextLine();
        while(!s.equals(password)){
            System.out.println("Wrong !");
            s = reader.nextLine();
        }
        System.out.println("Right !");
        System.out.println("The secret ingredient of the secret ingredient soup is ... \n Nothing!");
    
	}
}
