package effectivejava.chapter6.item39.regularannotation;
import java.lang.annotation.*;

// Marker annotation type declaration - Page 180
import java.lang.annotation.*;

/**
 * Indicates that the annotated method is a test method.
 * Use only on parameterless static methods.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}