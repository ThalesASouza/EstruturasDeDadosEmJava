package br.com.estudo.estruturadedados.model;

public class Node {

    private String data;
    private Node next;

    public Node() {}

    public Node(final String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }
}
