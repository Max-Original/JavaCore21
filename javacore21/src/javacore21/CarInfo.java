package javacore21;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//Creating Annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface CarInfo {
	String value() default "private annotation";
}
