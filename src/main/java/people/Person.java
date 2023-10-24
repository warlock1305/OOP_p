package people;

public class Person{
    String FIO;
    String INFO;

    public Person(String FIO, String INFO){
        this.FIO = FIO;
        this.INFO = INFO;
    }

    public String getFIO(){
        return this.FIO;
    }
    public String getINFO(){
        return this.INFO;
    }
    public void setFIO(String a){
        this.FIO = a;
    }
    public void setINFO(String a){
        this.INFO = a;
    }
    public String toString(){
        return this.getFIO() + "\n  " + this.getINFO();
    }

}

