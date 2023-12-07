package labs.W6.NightSkies;

public class Main {
    public static void main(String[] args){
        NightSky sky = new NightSky(0.3, 10, 10);
        sky.print();
        System.out.println(sky.numOfStars());

    }
}
