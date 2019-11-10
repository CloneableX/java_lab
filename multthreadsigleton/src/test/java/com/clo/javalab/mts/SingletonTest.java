package com.clo.javalab.mts;

import org.junit.Test;

import javax.management.ReflectionException;
import javax.management.relation.RelationException;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SingletonTest {
    @Test
    public void should_get_same_instance_when_get_instance_from_singleton() throws ReflectionException {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertThat(instance1, is(instance2));
    }

    @Test(expected = InvocationTargetException.class)
    public void should_get_reflection_exception_when_get_singleton_by_reflection() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ReflectionException {
        Singleton instance1 = Singleton.getInstance();

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance2 = constructor.newInstance();

        assertThat(instance1, is(instance2));
    }

    @Test
    public void should_get_same_instance_when_get_singleton_by_serialised() throws IOException, ReflectionException, ClassNotFoundException {
        Singleton instance1 = Singleton.getInstance();
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("singletonFile"));
        os.writeObject(instance1);

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("singletonFile")));
        Singleton instance2 = (Singleton) is.readObject();
        assertThat(instance1, is(instance2));
    }
}
