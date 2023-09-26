package org.mpei.HomeWork_5.LinkedList;

/**Данный класс, является классом-оберткой. Он моделирует один элемент списка.
 * У элемента есть собственное значение, ссылка на предыдущий элемент, ссылка на последующий элемент.
 * Getter and Setter, а также конструкторы позволяют полноценно работать с данным классом и получать необходимые данные.*/
public class LinkedListEl<T> {
    private T value;
    private LinkedListEl<T> leftEl;
    private LinkedListEl<T> rightEl;

    public LinkedListEl() {
    }

    public LinkedListEl(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkedListEl<T> getLeftEl() {
        return leftEl;
    }

    public void setLeftEl(LinkedListEl<T> leftEl) {
        this.leftEl = leftEl;
    }

    public LinkedListEl<T> getRightEl() {
        return rightEl;
    }

    public void setRightEl(LinkedListEl<T> rightEl) {
        this.rightEl = rightEl;
    }
}
