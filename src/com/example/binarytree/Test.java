package com.example.binarytree;

public class Test {


    public static void main(String[] args) {
        MyBST bst = new MyBST();

        //Add data to tree
        bst.add(new Node(12));
        bst.add(new Node(7));
        bst.add(new Node(14));
        bst.add(new Node(7));
        bst.add(new Node(3));
        bst.add(new Node(18));



        System.out.println("Pre Order Traversal");
        bst.preOrderTraversal(bst.root);

        System.out.println("************************************************");

        System.out.println("Post Order Traversal");
        bst.postOrderTraversal(bst.root);

        System.out.println("************************************************");

        System.out.println("In Order Traversal");
        bst.inOrderTraversal(bst.root);

    }
}
