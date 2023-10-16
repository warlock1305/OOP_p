package org.example;
import java.util.Scanner;

public class L2t4 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("First:");
        int a = reader.nextInt();
        System.out.println("Second:");
        int b = reader.nextInt();
        while(a <= b){
            System.out.println(a);
            a++;
        }
    }
}
