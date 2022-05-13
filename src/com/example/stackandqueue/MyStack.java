package com.example.stackandqueue;

import java.util.ArrayList;

public class MyStack <T>{
    /**
     * the body of stack
     */
    ArrayList<T> s ;
    /**
     * last input added element in stack
     */
    int top=-1;


    /**
     * Default Constructor Initializes the stack.
     */
    MyStack(){
        s=new ArrayList<>();
    }



    /**
     * A method to insert a new value into stack.
     *
     * @param input the value to be inserted
     */
    public void push(T input){
        s.add(input);
    }


    /**
     * A method to get value from stack.
     *
     * @return  return and remove the last value added in the stack
     */
    public T pop(){
        T e = s.get(s.size()-1);
        s.remove(s.size()-1);
        return e;
    }

    /**
     * A method to get the top value stack.
     *
     * @return  return the last value added in the stack
     */

    public T top(){
        if (!s.isEmpty()){
            return s.get(s.size()-1);
        }
        return (T) "stack in Empty";
    }

    /**
     * A method to check is stack has element or no .
     *
     * @return  return ture if stack has no element
     */
    Boolean isEmpty(){return s.isEmpty();}




}
