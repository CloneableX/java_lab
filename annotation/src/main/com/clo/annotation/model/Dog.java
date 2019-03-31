package com.clo.annotation.model;

import com.clo.annotation.anno.AnimalColor;
import com.clo.annotation.anno.AnimalName;
import com.clo.annotation.anno.AnimalOwner;

/**
 * com.clo.annotation.model.Dog
 *
 * @author Cloneable
 * @date 2019/3/31 16:14:31
 * @description dog is a class of animal
 */
public class Dog {
    @AnimalName("Clob")
    private String name;

    @AnimalColor(color = AnimalColor.Color.BLUE)
    private String color;

    @AnimalOwner(name = "Cloneable", address = "China")
    private String owner;
}
