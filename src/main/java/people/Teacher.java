package people;

public class Teacher extends Person{
    public int salary;
    public Teacher(String FIO, String INFO, int salary){
        super(FIO, INFO);
        this.salary  = salary;
    }
    public int getSalary(){
        return this.salary;
    }
    public String toString(){
        return super.toString() +" "+ this.getSalary();
    }
}
