package com.bridgelabz.binarysearchtreetest;

import com.bridgelabz.binarysearchtree.MyBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyBinaryTreeTest {
    @Test
    public void added3Numbers_IntoBST() {
        MyBinaryTree<Integer> bst = new MyBinaryTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        int size = bst.getSize();
        Assertions.assertEquals(3, size);
    }

}
