package effectivejava.chapter6.item39.regularannotation;
import java.lang.annotation.*;

// Annotation type with an array parameter -  Page 183

/**
 * Indicates that the annotated method is a test method that
 * must throw the designated exception to succeed.
 */
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
//public @interface ExceptionTest {
//    Class<? extends Throwable> value();
//}

// Annotation type with an array parameter
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
    Class<? extends Throwable>[] value();
}