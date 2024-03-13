package org.Jan.jfs.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)


public @interface DocInfo {
    String author();
    String createDate();
    String description();
    String version() default "1.0";
    String[] reviewers() default {};

}
