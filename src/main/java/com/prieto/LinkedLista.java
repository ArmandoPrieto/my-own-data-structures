package com.prieto;

public class LinkedLista<T>{

    private Node<T> first;
    private Node<T> last;

    public LinkedLista() {

    }

    public void add(T nodeValue){
        Node node = new Node(nodeValue);
        if(this.first == null){
            this.first = this.last = node;
            this.first.next = this.last;
        }else{
            this.last.next = node;
            this.last = node;
        }
    }

    public T remove(){
        if(this.first == null)
            return null;
        T nodeValue = this.first.getValue();
        this.first = this.first.getNext();
        return nodeValue;
    }

    public Node<T> getFirst() {
        return first;
    }

   public Node<T> getLast() {
        return last;
    }

    public Node<T> peek(int index){
        if(this.getFirst() == null)
            return null;
        Node node = this.getFirst();
        int i = 0;
        do{
            if(i == index)
                return node;
            i++;
        }while((node = node.getNext()) != null);

        return null;
    }
}
