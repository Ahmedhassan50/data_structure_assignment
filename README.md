# Data structure 




## 1- Linked List

### Description

LinkedList is a data structure in which data is stored in a linear manner. It usually contains a data field and a link to the memory location of the next mode.

### Structure

```
class Node <T>{
    T data;
    Node next;
}
```


The `next` variable points to the next node in the data structure and value stores the data. Any number of nodes can be linked in this manner. The structure will be:


### Properties
1. Linked list does not provide indexing like an array. For accessing a node at position `p` , &theta;(p) nodes need to be accessed.
2. Main advantage of linked list is addition and removal of nodes near the end and beginning of lists. It can be done just by updating the link (O(1) time)
3. Unlike an array, its size is not predefined. So any number of nodes can be appended.


<details>
<summary><strong>Running Tests</strong></summary>

Running and reviewing unit tests is a great way to get familiarized with this class and its methods. You can find [MyLinkedListTest.java](https://github.com/Ahmedhassan50/data_structure_assignment/blob/master/src/com/example/linkedlist/MyLinkedListTest.java)
which contains all valid and invalid test cases for every function

</details>


## 2- Tree
### Description

Tree is a data structure where the data is organized in a hierarchial structure. There should be one root node (which does not have any parent) and all subsequent nodes are represented as children of the root node and its children. If a node has at least one child, it is called `internal` node and nodes with no children are called `leaf` nodes.

### Basic Structure

```
class Node{
    int data;
    Node left;
    Node right;
}
```

This basic structure is for a binary tree where each internal tree has at least one and at most two children. `left` and `right` represent the two children and `value` is the placeholder for data.


### Properties
1. Tree data structure gives the facility to organize data in a hierarchial structure
2. Tree nodes can be inserted in a sorted order which can be used for searching and inserting data in O(logN) time where N is the number of nodes.

<details>
<summary><strong>Running Tests</strong></summary>

Running and reviewing unit tests is a great way to get familiarized with this class and its methods. You can find [MyBSTTest.java](https://github.com/Ahmedhassan50/data_structure_assignment/blob/master/src/com/example/binarytree/MyBSTTest.java)
which contains all valid and invalid test cases for every function

</details>


## 3- STACK

Stack is an ADT (abstract data type) that acts like a list of objects but there is a difference.

Stack works on the principle of _LIFO_ (Last In First Out), it means that the last item added to the stack will be the first item to be removed.

Stack is based on two methods (functions)-

## push(element)

It adds "element" to the top of the stack.

For example: If we have `1, 3, 5` in stack, and we call push(9),

`9` will be added to last index of stack -> `1, 3, 5 , 9`.

## top()

It returns element at the top of the stack.

For example: If we have `1, 3, 5` in stack, and we call peek(),

`5` will be returned (without removing it from the stack).

## pop()

It removes the last element (i.e. top of stack) from stack.

For example: If we have `1, 3, 5 , 9` in stack, and we call pop(),

the function will return `9` and the stack will change to `1, 3, 5`.

<details>
<summary><strong>Running Tests</strong></summary>

Running and reviewing unit tests is a great way to get familiarized with this class and its methods. You can find [MyStackTest.java](https://github.com/Ahmedhassan50/data_structure_assignment/blob/master/src/com/example/stackandqueue/MyStackTest.java)
which contains all valid and invalid test cases for every function

</details>

## 4- Queue

- It is an ordered list of objects that follows the **FIFO** (First-In-First-Out) principle.

## Characteristics of a Queue
- The Queue is used to insert elements at the end of the queue and removes elements from the beginning of the queue.
- It supports all methods of Collection interface including insertion, deletion etc.
- LinkedList, ArrayBlockingQueue and PriorityQueue are the most commonly used implementations.

## Declaration

`MyQueue<Integer> queue =new MyQueue<>();` 


<details>
<summary><strong>Running Tests</strong></summary>

Running and reviewing unit tests is a great way to get familiarized with this class and its methods. You can find [MyQueueTest.java](https://github.com/Ahmedhassan50/data_structure_assignment/blob/master/src/com/example/stackandqueue/MyQueueTest.java)
which contains all valid and invalid test cases for every function

</details>
