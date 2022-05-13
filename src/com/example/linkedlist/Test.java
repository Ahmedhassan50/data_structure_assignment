package com.example.linkedlist;

public class Test {

    public static void main(String[] args){
        MyLinkedList<Integer> myList =new MyLinkedList<>();

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
        myList.add(60);

        myList.addFirst(17);
        myList.addFirst(19);


        System.out.println("All list Elements");
        myList.show();

        // remove one element from list
        myList.remove();
        System.out.println("*************************");
        System.out.println("All list after delete one element");
        myList.show();
        System.out.println("*************************");
        System.out.println("Head of list");
        System.out.println(myList.getHead().data);
        System.out.println("*************************");
        System.out.println("Tail of list");
        System.out.println(myList.getTail().data);
    }
}
