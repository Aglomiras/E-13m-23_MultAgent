package org.mpei.HomeWork_5.BinarWood;

public class BinaryWoodInfo {
    private int value;
    private BinaryWoodInfo leftChild;
    private BinaryWoodInfo rightChild;

    public BinaryWoodInfo() {
    }

    public BinaryWoodInfo(int value) {
        this.value = value;
    }

    public BinaryWoodInfo(int value, BinaryWoodInfo leftChild) {
        this.value = value;
        this.leftChild = leftChild;
    }

    public BinaryWoodInfo(int value, BinaryWoodInfo leftChild, BinaryWoodInfo rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryWoodInfo getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryWoodInfo leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryWoodInfo getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryWoodInfo rightChild) {
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
}
