package labs.W6.NightSkies;

import java.util.Random;

public class NightSky {
    double density;
    int width;
    int height;

    public NightSky(double density){
        this.density = density;
        width = 20;
        height = 10;
    }

    public NightSky(int width, int height){
        density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        int countline = 0;
        Random rand = new Random();
        for (int i = 0; i < width; i++) {
            if(rand.nextDouble() <= this.density){
                System.out.print("*");
                countline += 1;
            }
            else{
                System.out.print(" ");
            }
        }
        countlast += countline;
    }

    int countlast = 0;
    public void print(){
        this.countlast = 0;
        for(int i = 0; i < height; i++){
            this.printLine();
            System.out.println();
        }
    }

    public int numOfStars(){
        return this.countlast;
    }
}
