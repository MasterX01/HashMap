package com.bridgelabz.binarysearchtree;

public class MyBinaryNode<K extends Comparable<K>> {
    K key;
    MyBinaryNode<K> leftChild;
    MyBinaryNode<K> rightChild;

    public MyBinaryNode(K key) {
        this.key = key;
        this.leftChild = null;
        this.rightChild = null;
    }
}
