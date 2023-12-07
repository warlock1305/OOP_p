package Services;

public class CivilService implements NationalService{
    int daysLeft;

    public CivilService(){
        this.daysLeft = 362;
    }

    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }

    @Override
    public void work(){
        System.out.println("20 push ups, NOW!");
    }
}
