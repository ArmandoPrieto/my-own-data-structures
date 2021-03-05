package com.prieto;

public class Stacko<T> {

    Node<T> head;

    public T pop(){
        if(this.head == null)
            return null;
        T val = this.head.getValue();
        this.head = this.head.getNext();
        return val;
    }

    public void put(T value){
        Node prevHead = this.head;
        this.head = new Node(value);
        this.head.setNext(prevHead);
    }
}
