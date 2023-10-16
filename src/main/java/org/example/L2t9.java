package org.example;

public class L2t9 {
    public static void printNumbers(int n){
        for(int i = 1; i <= n; i++){
            System.out.print(i);
        }
        System.out.print("\n");
    }
    public static void drawNumbersPiramid(int n){
        for(int i = 1; i <= n; i++){
            printNumbers(i);
        }
    }
    public static void main(String[] args){
        drawNumbersPiramid(10);
    }
}
