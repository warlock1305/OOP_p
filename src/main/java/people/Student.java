package people;

public class Student extends Person{
    private int credits = 0;
    public int getCredits(){
        return this.credits;
    }
    public void setCredits(int a){
        this.credits = a;
    }
    public int credits(){
        return this.getCredits();
    }

    public Student(String FIO, String INFO){
        super(FIO, INFO);
    }
    public void study(){
        this.setCredits(this.getCredits() + 1);
    }

    public String toString(){
        return super.toString() + "\n Credits " + this.getCredits();
    }
}
