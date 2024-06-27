package br.com.estudo.estruturadedados.app;

import br.com.estudo.estruturadedados.model.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        System.out.println("--------------------Testando os metodos de Inserção----------------------");

        linkedList.prepend("Elemento3");
        linkedList.prepend("Elemento2");
        linkedList.prepend("Elemento1");
        linkedList.append("Elemento4");
        linkedList.prepend("Elemento0");
        linkedList.append("Elemento5");
        linkedList.append("Elemento7");
        linkedList.insert(6,"Elemento6");
        linkedList.insert(3,"Elemento2.5");

        linkedList.print();

        System.out.println("--------------------Testando os metodos de Busca----------------------");

        System.out.println("Head: " + linkedList.getHead());
        System.out.println("Tail: " + linkedList.getTail());
        System.out.println("Node of Index: " + linkedList.get(8));


    }
}
