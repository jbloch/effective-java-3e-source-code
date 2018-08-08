package effectivejava.chapter6.item39.markerannotation;
import java.lang.annotation.*;

// Marker annotation type declaration - Page 180
import java.lang.annotation.*;

// Marker annotation type declaration (Page 180)

/**
 * Indicates that the annotated method is a test method.
 * Use only on parameterless static methods.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}