package com.example.linkedlist;



/**
 * Linked list with generic types
 */

public class MyLinkedList<T> {

    /**
     * Head refer to the front of the list
     */
    private Node<T> head;

    /**
     * Tail refer to the end of the list
     */
    private Node<T> tail;


    /**
     * Size of List
     */
    private int size;


    /**
     * Add an element as the head of list
     *
     * @param data the head node of list
     */
    public void addFirst(T data){
        Node<T> node = new Node<>();
        node.data =data;
        node.next=head;
        head=node;
        size++;
    }


    /**
     * Add an element to list
     *
     * @param data the node that you want to add to the list
     */
    public void add(T data) {
        Node<T> node = new Node<T>();
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            if (tail == null) {
                head.next = node;
            } else {
                tail.next = node;
            }
            tail = node;

        }

        size++;

    }


    /**
     * show all element in the list
     */
    public void show() {
        Node n = head;

        if (head != null) {

            boolean isFinished = false;

            while (!isFinished) {
                System.out.println(n.data);
                if (n.next != null) {
                    n = n.next;
                } else {
                    isFinished = true;
                }
            }

        }

    }


    /**
     * remove one element form the list
     */
    public void remove(){
        Node n = head;
        for (int i=0;i<size;i++){
            if(n.next ==tail){
                tail=n;
                n.next=null;
                break;
            }

            n=n.next;
        }

        size--;
    }

    /**
     * @return  return the first element of the list
     */

    public Node<T> getHead() {
        if (head == null) {
            return new Node<>();
        }
        return head;
    }

    /**
     * @return  return the last element of the list
     */
    public Node<T> getTail() {
        if (head == null) {
            return new Node<>();
        }
        if (tail == null) {
            return head;
        }
        return tail;
    }

    /**
     * @return  return the size of the list
     */
    public int size() {
        return size;
    }


}
