package org.mpei.ClassWork_6;

public class MyOptional<T> { //Класс-обертка
    /**
    Дженерик позваляет сделаеть определение типа листа чуть позже, при создании первой переменной
     */
    private T object = null;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public boolean isEmpty() {
        return object != null;
    }
}
