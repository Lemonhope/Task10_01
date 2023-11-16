package Task10_01;

import java.lang.annotation.*;

/**
 * Annotation for calculator
 */
//@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CalcAnno {
    /**
     * First number for calculation
     */
double num1() default 0;
    /**
     * Second number for calculation
     */
double num2() default 0;
}
