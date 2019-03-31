package com.clo.annotation.utils;

import com.clo.annotation.anno.AnimalColor;
import com.clo.annotation.anno.AnimalName;
import com.clo.annotation.anno.AnimalOwner;

import java.lang.reflect.Field;

/**
 * com.clo.annotation.utils.AnimalAnnoUtil
 *
 * @author Cloneable
 * @date 2019/3/31 16:28:31
 * @description annotation util for animal annotation
 */
public class AnimalAnnoUtil {
    public static void printAnimalInfo(Class clazz) {
        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields) {
            if(field.isAnnotationPresent(AnimalName.class)) {
                AnimalName animalName = field.getAnnotation(AnimalName.class);
                System.out.println("Animal name is " + animalName.value());
            } else if(field.isAnnotationPresent(AnimalColor.class)) {
                AnimalColor animalColor = field.getAnnotation(AnimalColor.class);
                System.out.println("Animal color is " + animalColor.color());
            } else if(field.isAnnotationPresent(AnimalOwner.class)) {
                AnimalOwner animalOwner = field.getAnnotation(AnimalOwner.class);
                System.out.println("Animal's owner is " + animalOwner.name() + ", his address is " + animalOwner.address());
            }
        }
    }
}
