package labs.W7.T1;

import labs.W7.T1.ClassLogger;
import labs.W7.T1.Logger;
import labs.W7.T1.RecordLogger;

public class sss {
    public static void main(String[] agrs){
        RecordLogger obj1 = new RecordLogger("Ali");
        ClassLogger obj2 = new ClassLogger("Marat");

        Logger recordlog = message -> obj1.logMessage(message);
        Logger classlog = message -> obj2.logMessage(message);

        recordlog.logMessage("haha");
        classlog.logMessage("Keep yourself safe");
    }
}
