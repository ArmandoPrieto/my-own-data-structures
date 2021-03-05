package com.prieto;

import io.micronaut.runtime.Micronaut;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
        LinkedLista<String> lista = new LinkedLista();
        lista.add("ABC");
        lista.add("DEF");
        lista.add("GHI");
//        System.out.println(lista.peek(3).getValue());
        /*while(lista.getFirst() != null){
            System.out.println(lista.getFirst().getValue());
            lista.remove();
        }

        lista.remove();
       // lista.remove();
        System.out.println("---");
        while(lista.getFirst() != null){
            System.out.println(lista.getFirst().getValue());
            lista.remove();
        }*/

        Stacko<String> stacko = new Stacko<>();
        stacko.put("3");
        stacko.put("5");
        stacko.put("7");
        stacko.put("8");

        System.out.println(stacko.pop());
        System.out.println(stacko.pop());
        System.out.println(stacko.pop());
        System.out.println(stacko.pop());
        System.out.println(stacko.pop());

        stacko.put("8");
        System.out.println(stacko.pop());


    }
}