package org.mpei.HomeWork_5.BinaryWood_Version1;

public class BinaryTreeInfo<T> {
    private T value;
    private BinaryTreeInfo<T> leftChild;
    private BinaryTreeInfo<T> rightChild;

    public BinaryTreeInfo(T value) {
        this.value = value;
    }

    public BinaryTreeInfo(T value, BinaryTreeInfo<T> leftChild) {
        this.value = value;
        this.leftChild = leftChild;
    }

    public BinaryTreeInfo(T value, BinaryTreeInfo<T> leftChild, BinaryTreeInfo<T> rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "BinaryWoodInfo{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryTreeInfo<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeInfo<T> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeInfo<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeInfo<T> rightChild) {
        this.rightChild = rightChild;
    }
}
