package org.mpei.HomeWork_5.LinkedList;

import java.util.List;

public class MyLinkedListEl<T> {
    private LinkedListEl<T> firstEl;
    private LinkedListEl<T> findLastEl() {
        if (firstEl != null) {
            LinkedListEl<T> rightEl = firstEl;
            while (rightEl != null) {
                if (rightEl.getRightEl() != null) {
                    rightEl = rightEl.getRightEl();
                } else {
                    break;
                }
            }
            return rightEl;
        } else {
            return null;
        }
    }

    /**Метод, который добавляет новый элемент в конец списка*/
    public void add(T element) {
        LinkedListEl<T> lastEl = findLastEl();
        if (lastEl != null) {
            LinkedListEl<T> newElement = new LinkedListEl<>(element);
            newElement.setLeftEl(lastEl);
            lastEl.setRightEl(newElement);
        } else {
            firstEl = new LinkedListEl<>(element);
        }
    }

    /**Метод, который возвращает элемент из списка по указанному индексу*/
    public T get(int index) {
        if (index > (size() - 1)) {
            throw new IndexOutOfBoundsException();
        } else {
            LinkedListEl<T> element = firstEl;
            for (int i = 0; i < index; i++) {
                element = element.getRightEl();
            }
            return element.getValue();
        }
    }

    /**Метод, который удаляет элемень из списка по указанному индексу*/
    public T remove(int index) {
        if (index > (size() - 1)) {
            throw new IndexOutOfBoundsException();
        } else {
            LinkedListEl<T> element = firstEl;
            for (int i = 0; i < index; i++) {
                element = element.getRightEl();
            }
            if (element == firstEl) {
                firstEl = firstEl.getRightEl();
                firstEl.setLeftEl(null);
            } else {
                LinkedListEl<T> leftEl = element.getLeftEl();
                LinkedListEl<T> rightEl = element.getRightEl();
                if (leftEl != null) {
                    leftEl.setRightEl(rightEl);
                }
                if (rightEl != null) {
                    rightEl.setLeftEl(leftEl);
                }
            }
            return element.getValue();
        }
    }

    /**Метод, который возвращает количество элементов в списке. Сколько элементов содержит список*/
    public int size() {
        int count = 1;
        if (firstEl != null) {
            LinkedListEl<T> rightEl = firstEl.getRightEl();
            while (rightEl != null) {
                count++;
                rightEl = rightEl.getRightEl();
            }
            return count;
        } else {
            return 0;
        }
    }
}
