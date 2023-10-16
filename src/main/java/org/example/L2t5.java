package org.example;
import java.lang.Math;
import java.util.Scanner;

public class L2t5 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += Math.pow(2, i);
        }
        System.out.println(ans);
    }
}
