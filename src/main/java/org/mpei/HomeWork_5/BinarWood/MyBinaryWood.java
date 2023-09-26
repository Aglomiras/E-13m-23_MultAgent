package org.mpei.HomeWork_5.BinarWood;

import io.grpc.netty.shaded.io.netty.handler.ssl.DelegatingSslContext;

public class MyBinaryWood {
    private BinaryWoodInfo rootValue;

    /**
     * Возвращает количество элементов в дереве
     * Использование методов: recursec() - (рекурсивный метод)
     * Принимаемые данные: -
     * Возвращаемые данные: int (количество элементов в бинарном древе)
     * */
    public int size() {
        int count = 0;
        if (rootValue == null) {
            return count;
        } else {
            count++;

            BinaryWoodInfo woodValue = rootValue;

            count = recursec(count, woodValue);
        }
        return count;
    }

    /**
     * Вспомогательный рекурсивный метод для подсчета элементов в дереве
     * Использование методов: -
     * Принимаемые данные: int (счетчик на данной итерации), BinaryWoodInfo (элемент бинарного древа)
     * Возвращаемые данные: int (счетчика для подсчета количества элементов в бинарном древе)
     * */
    private int recursec(int count, BinaryWoodInfo woodValue) {
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
    public void add(int value) {
        BinaryWoodInfo newBinWoodVal = new BinaryWoodInfo();
        newBinWoodVal.setValue(value);

        if (rootValue == null) {
            System.out.println("У дерева нет корневых элементов. Новый элемент становится корневым");
            rootValue = newBinWoodVal;
        } else {
            BinaryWoodInfo startWood = rootValue; //Создание корневого элемента, для начала поиска
            BinaryWoodInfo parentWood;

            boolean flag = true;

            while (flag == true) {

                parentWood = startWood;

                if (value == startWood.getValue()) {
                    System.out.println("Такой элемент уже есть");
                    flag = false;

                } else if (value < startWood.getValue()) {
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

    /**
     * Удаляет элемент из дерева
     * Использование методов: trackWood() - (метод по поиску наименьшего члена в большей ветки, отходящей от удаляемого элемента)
     * Принимаемые данные: int (значение удаляемого элемента)
     * Возвращаемые данные: int (значение удаленного элемента), сообщение в консоль
     * */
    public int remove(int value) {

        BinaryWoodInfo remWood = null;
        BinaryWoodInfo remWoodParent = null;

        if (rootValue != null) {

            BinaryWoodInfo binaryWoodInfo = rootValue;

            while (binaryWoodInfo.getValue() != value) {

                remWoodParent = binaryWoodInfo;

                if (value < binaryWoodInfo.getValue()) {
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

            BinaryWoodInfo replacWood = trackWood(remWood);

            if (remWood == rootValue) {
                rootValue = replacWood;
            } else if (remWood == remWoodParent.getRightChild()) {
                remWoodParent.setRightChild(replacWood);
            } else {
                remWoodParent.setLeftChild(replacWood);
            }

        } else if (remWood.getRightChild() == null) {
            if (remWood == rootValue) {
                rootValue = remWood.getLeftChild();
            } else if (remWood == remWoodParent.getRightChild()) {
                remWoodParent.setRightChild(remWood.getLeftChild());
            } else {
                remWoodParent.setLeftChild(remWood.getLeftChild());
            }

        } else if (remWood.getLeftChild() == null) {
            if (remWood == rootValue) {
                rootValue = remWood.getRightChild();
            } else if (remWood == remWoodParent.getRightChild()) {
                remWoodParent.setRightChild(remWood.getRightChild());
            } else {
                remWoodParent.setLeftChild(remWood.getRightChild());
            }

        } else {
            if (remWood == rootValue) {
                rootValue = null;
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
    private BinaryWoodInfo trackWood(BinaryWoodInfo remWood) {

        BinaryWoodInfo remWoodParent = remWood;
        BinaryWoodInfo remWoodOne = remWood.getRightChild();
        BinaryWoodInfo replacWood = remWoodOne;

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
    public BinaryWoodInfo find(int value) {

        if (rootValue != null) {

            BinaryWoodInfo binaryWoodInfo = rootValue;

            while (binaryWoodInfo.getValue() != value) {
                if (value < binaryWoodInfo.getValue()) {
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
