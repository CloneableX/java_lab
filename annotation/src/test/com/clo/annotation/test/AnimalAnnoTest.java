package com.clo.annotation.test;


import com.clo.annotation.model.Dog;
import com.clo.annotation.utils.AnimalAnnoUtil;

import javax.annotation.Resource;

/**
 * com.clo.annotation.test.AnimalAnnoTest
 *
 * @author Cloneable
 * @date 2019/3/28 23:30:28
 * @description
 */
public class AnimalAnnoTest {
    public static void main(String[] args) {
        AnimalAnnoUtil.printAnimalInfo(Dog.class);
    }
}
