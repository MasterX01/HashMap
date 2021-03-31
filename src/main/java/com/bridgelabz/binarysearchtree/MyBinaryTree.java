package com.bridgelabz.binarysearchtree;

public class MyBinaryTree <K extends Comparable<K>> {
    public MyBinaryNode<K> rootNode;
    public void add(K key) {
        this.rootNode = this.addNodes(rootNode, key);
    }
    private MyBinaryNode<K> addNodes(MyBinaryNode<K> nodeValue, K key) {
        if(nodeValue == null)
            return new MyBinaryNode<>(key);
        int result = key.compareTo(nodeValue.key);
        if(result == 0)
            return nodeValue;
        else if(result < 0)
            nodeValue.leftChild = addNodes(nodeValue.leftChild, key);
        else
            nodeValue.rightChild = addNodes(nodeValue.rightChild, key);
        return nodeValue;
    }

    public int getSize() {
        return this.getSizeRecursively(rootNode);
    }
    private int getSizeRecursively(MyBinaryNode<K> nodeValue) {
        return nodeValue == null ? 0 : 1 + this.getSizeRecursively(nodeValue.leftChild) +
                                            this.getSizeRecursively(nodeValue.rightChild);
    }
}
