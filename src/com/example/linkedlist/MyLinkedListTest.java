package com.example.linkedlist;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * @Author: Ahmed Hassan
 * @Date: 12/5/2022
 */

public class MyLinkedListTest {

  static MyLinkedList<Integer> myList ;

    @BeforeClass
    public static void initiateLinkedList() {
        myList = new MyLinkedList<>();
        myList.add(40);
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(30);
    }

    @Test
    public void addFirst_add_element_to_the_head_of_list(){
        myList.addFirst(40);
        int head = myList.getHead().data;
        assertEquals(40,head);
    }

    @Test
    public void add_add_element_to_the_list(){
        myList.add(50);
        int tail = myList.getTail().data;
        assertEquals(50,tail);
    }

    @Test
    public void remove_one_element_from_the_list(){
        myList.remove();
        int tail = myList.getTail().data;
        assertEquals(30,tail);
    }


    @Test
    public void getTail_return_the_last_element_of_the_list(){
        int tail = myList.getTail().data;
        assertEquals(30,tail);
    }

    @Test
    public void getHead_return_the_first_element_of_the_list(){
        int head = myList.getHead().data;
        assertEquals(40,head);
    }

    @Test
    public void getSize_return_the_size_of_the_list(){
        assertEquals(6,myList.size());
    }












}