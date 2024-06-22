package br.com.estudo.estruturadedados.model;

public class LinkedList {

    private Node head;
    private Node tail;
    private Node firstAux;
    private Node secondAux;
    private int length;

    public int getLength() {
        return length;
    }

    public LinkedList() {
    }

    public void prepend(final String data) {

        this.firstAux = new Node(data);

        if (this.length == 0) this.head = this.tail = this.firstAux;

        if (this.length > 0) {

            this.firstAux.setNext(this.head);
            this.head = this.firstAux;

        }

        this.length++;

    }

    public void append(final String data) {

        this.firstAux = new Node(data);

        if (this.length == 0) this.head = this.tail = this.firstAux;

        if (this.length > 0) {

            this.tail.setNext(this.firstAux);
            this.tail = this.firstAux;

        }

        this.length++;

    }

    public void insert(final int index, final String data) {

        this.firstAux = this.head;
        this.secondAux = new Node(data);
        boolean validate = (index <= this.length && index >= 0);

        if (!validate) System.out.println("Invalid Index");

        if (validate) {

            if (index == 0) this.prepend(data);

            if (index > 0) {

                for (int i = 0; i < index - 1; i++) {
                    this.firstAux = this.firstAux.getNext();
                }

                this.secondAux.setNext(this.firstAux.getNext());
                this.firstAux.setNext(this.secondAux);

            }
            this.length++;
        }
    }

    public void print() {
        this.firstAux = this.head;
        while (firstAux != null) {
            System.out.println(firstAux.getData());
            firstAux = firstAux.getNext();
        }

    }


}
