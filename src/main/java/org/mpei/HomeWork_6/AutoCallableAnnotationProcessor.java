package org.mpei.HomeWork_6;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class AutoCallableAnnotationProcessor {

    static {

        Reflections reflections = new Reflections(Call.class);
        Set<Class<? extends Call>> getMethodAnnotation = reflections.getSubTypesOf(Call.class);

//        System.out.println("Good!");

        for (Class<? extends Call> classAuto : getMethodAnnotation) {
            Method[] methods = classAuto.getDeclaredMethods();
//            System.out.println("Good!");
            for (Method method : methods) {
                if (method.isAnnotationPresent(AutoCallable.class)) {

                    try {
                        method.invoke(classAuto.getDeclaredConstructor().newInstance());

                    } catch (RuntimeException
                             | NoSuchMethodException
                             | InstantiationException
                             | IllegalAccessException
                             | InvocationTargetException exception) {
                        throw new RuntimeException(exception);
                    } finally {
                        System.out.println("По крайней мере, до определения аннотации дошли...");
                    }
                }
            }
        }
    }
}
