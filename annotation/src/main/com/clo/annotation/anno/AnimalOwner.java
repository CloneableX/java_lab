package com.clo.annotation.anno;

import java.lang.annotation.*;

/**
 * com.clo.annotation.anno.AnimalOwner
 *
 * @author Cloneable
 * @date 2019/3/31 16:12:31
 * @description annotation for animal owner info
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnimalOwner {
    String name() default "";
    String address() default "";
}
