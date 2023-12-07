package labs.W7.T1;

import labs.W7.T1.Logger;

public record RecordLogger(String name) implements Logger {
    public void logMessage(String mess){
        System.out.println(mess + ": name is " + this.name);
        }
}
