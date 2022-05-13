package com.example.binarytree;

public class MyBST {

    /**
     * Reference for the node of BST.
     */
    Node root;

    /**
     * Reference for root to make some operations without change root value .
     */
    Node buffer;


    /**
     * Default Constructor Initializes the root of BST with null.
     */
    MyBST() {
        root = null;
        buffer=null;
    }


    /**
     * A method to insert a new value in BST.
     *
     * @param node the value to be inserted
     */

    public void add(Node node) {
        if (root != null) {
            if (node.data >= buffer.data) {
                if (buffer.right == null) {
                    buffer.right = node;
                    buffer=root;
                } else {
                    buffer=buffer.right;
                    add(node);
                }
            }else{
                if (buffer.left == null) {
                    buffer.left = node;
                    buffer=root;
                } else {
                    buffer=buffer.left;
                    add(node);
                }
            }
        }else{
            root=node;
            buffer=root;
        }
    }


    /**
     * A method for preOrder traversal of BST.
     *
     * @param node the first node to start traversal
     */

    public void preOrderTraversal(Node node){
        if(node!=null){
            System.out.println(node.data);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    /**
     * A method for inOrder traversal of BST.
     *
     * @param node the first node to start traversal
     */
    public void inOrderTraversal(Node node){
        if(node!=null){
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    /**
     * A method for postOrder traversal of BST.
     *
     * @param node the first node to start traversal
     */

    public void postOrderTraversal(Node node){
        if(node!=null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.data);
        }
    }



}
