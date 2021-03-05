package com.prieto;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLista<T> {

   T[] dataArray;
   private int pointer = 0;
   private static final int MIN_CAPACITY = 10;

    public ArrayLista() {
        this.dataArray = new T[MIN_CAPACITY]();
    }
    

    public T get(int index){
       return this.dataArray[index];
   }

   public void add(T element){
       if(pointer == this.dataArray.length){
            this.grow();
       }
       this.dataArray[this.pointer] = element;
       this.pointer++;
   }

   public T remove(int index){
       if(index >= this.dataArray.length || index < 0)
           return null;
       T prev = this.dataArray[index];
       for(int i = index;i < this.dataArray.length - 1; i++){
           this.dataArray[i] = this.dataArray[i + 1];
       }
       return prev;
   }

   private void grow(){
       int newSize = this.dataArray.length * 2;
       dataArray = Arrays.copyOf(dataArray, newSize);
   }
   
}
