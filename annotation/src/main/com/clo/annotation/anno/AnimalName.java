package com.clo.annotation.anno;

import java.lang.annotation.*;

/**
 * com.clo.annotation.anno.AnimalName
 *
 * @author Cloneable
 * @date 2019/3/31 16:08:31
 * @description Annotation for animal name
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnimalName {
    String value() default "";
}
