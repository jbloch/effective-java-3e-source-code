package effectivejava.chapter6.item39.annotationwitharrayparameter;
import java.lang.annotation.*;

// Annotation type with an array parameter  (Page 184)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
    Class<? extends Exception>[] value();
}