package com.clo.annotation.anno;

import java.lang.annotation.*;

/**
 * com.clo.annotation.anno.AnimalColor
 *
 * @author Cloneable
 * @date 2019/3/31 16:09:31
 * @description annotation for animal color
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnimalColor {
    public enum Color{RED, BLUE, YELLOW};

    Color color() default Color.YELLOW;
}
