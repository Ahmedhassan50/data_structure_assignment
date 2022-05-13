package com.example.stackandqueue;

import com.example.linkedlist.MyLinkedList;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    static MyStack<Integer> stack ;

    @BeforeClass
    public static void initiateLinkedList() {
        stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
    }

    @Test
    public void isEmpty_return_true_when_stack_has_no_value(){
        assertFalse(stack.isEmpty());
    }

    @Test
    public void top_get_top_element_of_stack(){
        int top = stack.top();
        assertEquals(50,top);
    }

    @Test
    public void push_add_element_to_stack(){
        stack.push(50);
        int top = stack.top();
        assertEquals(50,top);
    }


    @Test
    public void pop_get_and_remove_last_element_from_stack(){
        int popElement =stack.pop();;
        assertEquals(50,popElement);
    }



}