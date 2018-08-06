package effectivejava.chapter6.item39.repeatableannotation;

import java.lang.annotation.*;

// Repeatable annotation type -  Page 186

/**
 * Indicates that the annotated staticfactory is a test staticfactory that
 * must throw the any of the designated exceptions to succeed.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExceptionTestContainer.class)
public @interface ExceptionTest {
    Class<? extends Throwable> value();
}