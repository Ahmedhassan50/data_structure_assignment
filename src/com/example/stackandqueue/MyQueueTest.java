package com.example.stackandqueue;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {

    static MyQueue<Integer> queue ;

    @BeforeClass
    public static void initiateLinkedList() {
        queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
    }


    @Test
    public void isEmpty_return_true_when_queue_has_no_value(){
        assertFalse(queue.isEmpty());
    }

    @Test
    public void enqueue_add_element_to_stack(){
        queue.enqueue(50);
        assertEquals(7,queue.size());
    }

    @Test
    public void dequeue_add_element_to_stack(){
        int value = queue.dequeue();
        assertEquals(10,value);
    }



}