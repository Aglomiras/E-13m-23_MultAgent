package org.mpei.ClassWork_6.LinkedList;

import java.util.*;

public class MyLinkedList<T> implements List<T> {

    private ValueWrap<T> last = null;
    private ValueWrap<T> first = null;
    @Override
    public boolean add(T t) {
        ValueWrap<T> val = new ValueWrap<>(t, null, null);
        if (this.first == null) {
            this.first = val;
        }
        val.prev = this.last;

        if (this.last != null) {
            this.last.next = val;
        }
        this.last = val;
        return true;
    }
    @Override
    public int size() {
        if (first == null) {
            return 0;
        }
        int size = 1;
        ValueWrap<T> firstRef = first.next;
        while (firstRef != null) {
            size++;
            firstRef = firstRef.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        if (first == null) {
            return false;
        }

        ValueWrap<T> checked = this.first;
        ValueWrap<T> found = null;

        while (checked != null) {
            if (checked.value.equals(o)) {
                found = checked;

                break;
            }
            checked = checked.next;
        }
        if (found == null) {
            return false;
        }
        ValueWrap<T> prev = checked.prev;
        ValueWrap<T> next = checked.next;

        prev.next = next;
        next.prev = prev;

        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        if (first == null) {
            throw new IndexOutOfBoundsException();
        }

        ValueWrap<T> checked = this.first;
        int count = 0;

        while (checked != null) {
            if (count == index) {
                return checked.value;
            }
            count++;
            checked = checked.next;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    public class ValueWrap<T> {
        T value;
        ValueWrap<T> next;
        ValueWrap<T> prev;

        public ValueWrap(T value, ValueWrap<T> next, ValueWrap<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "ValueWrap{" +
                    "value=" + value +
                    '}';
        }
    }
}
