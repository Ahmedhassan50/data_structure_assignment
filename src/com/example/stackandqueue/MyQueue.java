package com.example.stackandqueue;

import java.util.ArrayList;

public class MyQueue <T>{

    /**
     * the body of queue
     */
    ArrayList<T> q ;

    /**
     * Default Constructor Initializes the queue.
     */
    MyQueue(){
        q = new ArrayList<>();
    }



    /**
     * A method to insert a new value into queue.
     *
     * @param input the value to be inserted
     */
    public void enqueue(T input){
        q.add(input);
    }



    /**
     * A method to get value from queue.
     *
     * @return  return and remove the first value added in the queue
     */
    public T dequeue(){
        T e = q.get(0);
        q.remove(0);
        return e;
    }


    /**
     * A method to check is queue has element or no .
     *
     * @return  return ture if queue has no element
     */

    Boolean isEmpty(){return q.isEmpty();}

    /**
     * @return  return the size of the queue
     */
    int size(){return q.size();}


}
