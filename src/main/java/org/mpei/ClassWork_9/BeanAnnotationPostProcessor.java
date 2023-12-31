package org.mpei.ClassWork_9;

import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BeanAnnotationPostProcessor {
    public List<Printer> findBeans() throws Exception {

        Reflections r = new Reflections(Printer.class); //Можно передать в метод конкретный класс среди которого необходимо искать объект
        Set<Class<?>> gettypeann = r.getTypesAnnotatedWith(Bean.class); //Нахождения объектов типа классов
        System.out.println("Пробел");

        List<Printer> printerList = new ArrayList<>();
        for (Class<?> clazz : gettypeann) {
            System.out.println("Пробел");
            if (!Printer.class.isAssignableFrom(clazz)) {
                System.out.println("555");
                continue;
            }

            Printer o = (Printer) clazz.getDeclaredConstructor().newInstance();
            printerList.add(o);
        }
        return printerList;
    }
}
