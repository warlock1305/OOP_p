package labs.W8;

import java.lang.annotation.*;
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CanSendMessage {

}
