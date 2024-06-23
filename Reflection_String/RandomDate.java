package Reflection_String;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RandomDate {

    long min() default 1704067200000L; // January 1, 2024, UTC0

    long max() default 1735689600000L; // January 1, 2025, UTC0
}