package labs.W8;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})

@Retention(RetentionPolicy.RUNTIME)

public @interface RequiresPermission {
    public String value() default "USER";
}
