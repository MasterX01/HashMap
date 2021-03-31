package com.bridgelabz.hashmap;

public class MyStackAndQueue {
    MyLinkedList myLinkedList;

    public MyStackAndQueue(){
        this.myLinkedList=new MyLinkedList();
    }

    public void push(INode myNode){
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printNodes();
    }

    public INode peak() { return myLinkedList.head; }

    public INode pop(){ return myLinkedList.pop(); }

    public void enqueu(INode myNode){ myLinkedList.append(myNode); }

    public INode dequeue(){ return myLinkedList.pop(); }

}
