package labs.W7.T1;

public class ClassLogger implements Logger {
    private String name;

    public ClassLogger(String name){
        this.name = name;
    }

    public void logMessage(String mess){
        System.out.println(mess + ": name is " + this.name);
    }
}
