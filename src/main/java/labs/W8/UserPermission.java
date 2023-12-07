package labs.W8;

import java.lang.annotation.*;

@Target({ElementType.TYPE})

@Retention(RetentionPolicy.RUNTIME)

public @interface UserPermission {
    public String value() default "ADMIN";
}
