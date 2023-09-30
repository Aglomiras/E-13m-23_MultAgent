package org.mpei.HomeWork_5.BinaryWood_Version1;

import java.util.*;

public class MyTreeWood<T> implements List<T> {
    private BinaryTreeInfo<T> treeNode;

    /**
     * Возвращает количество элементов в дереве
     * Использование методов: recursec() - (рекурсивный метод)
     * Принимаемые данные: -
     * Возвращаемые данные: int (количество элементов в бинарном древе)
     * */
    public int size() {
        int count = 0;
        if (treeNode == null) {
            return count;
        } else {
            count++;

            BinaryTreeInfo<T> woodValue = treeNode;

            count = recursec(count, woodValue);
        }
        return count;
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
    public boolean add(T t) {
        return false;
    }

    /**
     * Вспомогательный рекурсивный метод для подсчета элементов в дереве
     * Использование методов: -
     * Принимаемые данные: int (счетчик на данной итерации), BinaryWoodInfo (элемент бинарного древа)
     * Возвращаемые данные: int (счетчика для подсчета количества элементов в бинарном древе)
     * */
    private int recursec(int count, BinaryTreeInfo<T> woodValue) {
        if (woodValue.getRightChild() != null) {
            count++;
            count = recursec(count, woodValue.getRightChild());
        }
        if (woodValue.getLeftChild() != null) {
            count++;
            count = recursec(count, woodValue.getLeftChild());
        }
        return count;
    }

    /**
     * Добавляет новый элемент в бинарное дерево
     * Использование методов: -
     * Принимаемые данные: int (значение элемента)
     * Возвращаемые данные: сообщение в консоль
     * */
    public void addd(T value) {
        BinaryTreeInfo<T> newBinWoodVal = new BinaryTreeInfo<>(value, null, null);
        newBinWoodVal.setValue(value);

        if (treeNode == null) {
            System.out.println("У дерева нет корневых элементов. Новый элемент становится корневым");
            treeNode = newBinWoodVal;
        } else {
            BinaryTreeInfo<T> startWood = treeNode; //Создание корневого элемента, для начала поиска
            BinaryTreeInfo<T> parentWood;

            boolean flag = true;

            while (flag == true) {

                parentWood = startWood;

                if (value == startWood.getValue()) {
                    System.out.println("Такой элемент уже есть");
                    flag = false;

                } else if ((int) value < (int) startWood.getValue()) {
                    System.out.println("Переход на узел левого потомка");
                    startWood = startWood.getLeftChild();

                    if (startWood == null) {
                        System.out.println("Элемент добавлен");
                        parentWood.setLeftChild(newBinWoodVal);
                        flag = false;
                    }

                } else {
                    System.out.println("Переходим на узел правого потомка");
                    startWood = startWood.getRightChild();

                    if (startWood == null) {
                        System.out.println("Элемент добавлен!");
                        parentWood.setRightChild(newBinWoodVal);
                        flag = false;
                    }
                }
            }
        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
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
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

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

    /**
     * Удаляет элемент из дерева
     * Использование методов: trackWood() - (метод по поиску наименьшего члена в большей ветки, отходящей от удаляемого элемента)
     * Принимаемые данные: int (значение удаляемого элемента)
     * Возвращаемые данные: int (значение удаленного элемента), сообщение в консоль
     * */
    @Override
    public T remove(int value) {

        BinaryTreeInfo<T> remWood = null;
        BinaryTreeInfo<T> remWoodParent = null;

        if (treeNode != null) {

            BinaryTreeInfo<T> binaryWoodInfo = treeNode;

            while ((int) binaryWoodInfo.getValue() != value) {

                remWoodParent = binaryWoodInfo;

                if (value < (int) binaryWoodInfo.getValue()) {
//                    System.out.println("Ищем элемент среди левых потомков");
                    binaryWoodInfo = binaryWoodInfo.getLeftChild();
                } else {
//                    System.out.println("Ищем элемент среди правых потомков");
                    binaryWoodInfo = binaryWoodInfo.getRightChild();
                }
            }

            remWood = binaryWoodInfo;

        } else {
            System.out.println("Дерево не имеет элементов");
        }

        if ((remWood.getLeftChild() != null) && (remWood.getRightChild() != null)) {

            BinaryTreeInfo<T> replacWood = trackWood(remWood);

            if (remWood == treeNode) {
                treeNode = replacWood;
            } else if (remWood == remWoodParent.getRightChild()) {
                remWoodParent.setRightChild(replacWood);
            } else {
                remWoodParent.setLeftChild(replacWood);
            }

        } else if (remWood.getRightChild() == null) {
            if (remWood == treeNode) {
                treeNode = remWood.getLeftChild();
            } else if (remWood == remWoodParent.getRightChild()) {
                remWoodParent.setRightChild(remWood.getLeftChild());
            } else {
                remWoodParent.setLeftChild(remWood.getLeftChild());
            }

        } else if (remWood.getLeftChild() == null) {
            if (remWood == treeNode) {
                treeNode = remWood.getRightChild();
            } else if (remWood == remWoodParent.getRightChild()) {
                remWoodParent.setRightChild(remWood.getRightChild());
            } else {
                remWoodParent.setLeftChild(remWood.getRightChild());
            }

        } else {
            if (remWood == treeNode) {
                treeNode = null;
            } else if (remWood == remWoodParent.getRightChild()) {
                remWoodParent.setRightChild(null);
            } else {
                remWoodParent.setLeftChild(null);
            }
        }

        System.out.println("Элемент успешно удален!");
        return remWood.getValue();
    }

    /**
     * Вспомогательный метод, по поиску наименьшего элемента, в большей ветке удаляемого элемента
     * Использование методов: -
     * Принимаемые данные: BinaryWoodInfo (удаляемый элемент)
     * Возвращаемые данные: BinaryWoodInfo (подставляемый элемент на место удаляемого)
     * */
    private BinaryTreeInfo<T> trackWood(BinaryTreeInfo<T> remWood) {

        BinaryTreeInfo<T> remWoodParent = remWood;
        BinaryTreeInfo<T> remWoodOne = remWood.getRightChild();
        BinaryTreeInfo<T> replacWood = remWoodOne;

        while (remWoodOne.getLeftChild() != null) {
            remWoodParent = replacWood;
            replacWood = remWoodOne;
            remWoodOne = remWoodOne.getLeftChild();
        }

        if (replacWood == remWood.getRightChild()) {
            remWoodParent.setRightChild(replacWood);
        } else {
            remWoodParent.setLeftChild(replacWood.getRightChild());
            replacWood.setRightChild(remWood.getRightChild());
        }

        return replacWood;
    }

    /**
     * Поиск элемента в дереве
     * Использование методов: -
     * Принимаемые данные: int (значение элемента)
     * Возвращаемые данные: BinaryWoodInfo (возвращаемый элемент древа)
     * */
    public BinaryTreeInfo<T> find(T value) {

        if (treeNode != null) {

            BinaryTreeInfo<T> binaryWoodInfo = treeNode;

            while (binaryWoodInfo.getValue() != value) {
                if ((int) value < (int) binaryWoodInfo.getValue()) {
                    System.out.println("Ищем элемент среди левых потомков");
                    binaryWoodInfo = binaryWoodInfo.getLeftChild();
                } else {
                    System.out.println("Ищем элемент среди правых потомков");
                    binaryWoodInfo = binaryWoodInfo.getRightChild();
                }
                if (binaryWoodInfo == null) {
                    System.out.println("В древе нет такого элемента");
                    return null;
                }
            }
            System.out.println("Искомый элемент является корневым");
            System.out.println("Элемент найден!");
            return binaryWoodInfo;

        } else {
            System.out.println("Дерево не имеет элементов");
            return null;
        }
    }
}
