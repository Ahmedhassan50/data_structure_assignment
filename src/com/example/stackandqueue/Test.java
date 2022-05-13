package com.example.stackandqueue;


public class Test {



    public static void main(String[] args){
        MyStack<Integer> stack =new MyStack<>();


        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        System.out.println("All stack elements");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


        System.out.println("******************************************************");

        MyQueue<Integer> queue =new MyQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("All Queue elements");

        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }








    }

}
