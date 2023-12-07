package Services;

public class MilitaryService implements NationalService{

    int daysLeft;

    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
    }
    @Override
    public int getDaysLeft(){
        return 0;
    }

    @Override
    public void work(){
        System.out.println("What ? They said 20 push ups, but I say to do 40 push ups, NOW!");
    }
}
