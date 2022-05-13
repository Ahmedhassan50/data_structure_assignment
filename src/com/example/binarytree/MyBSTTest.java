package com.example.binarytree;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.Assert.*;

public class MyBSTTest {

    static MyBST bst;
    private static final PrintStream standardOut = System.out;
    private static final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeClass
    public static void initiateLinkedList() {
        System.setOut(new PrintStream(outputStreamCaptor));
        bst = new MyBST();
        bst.add(new Node(12));
        bst.add(new Node(7));
        bst.add(new Node(14));
        bst.add(new Node(7));
        bst.add(new Node(3));
        bst.add(new Node(18));
    }

    @Test
    public void preOrderTraversal(){
        bst.preOrderTraversal(bst.root);
       assertEquals( "12\r\n7\r\n3\r\n7\r\n14\r\n18", outputStreamCaptor.toString().trim());

    }
    @After
    public void reset() {
        System.setOut(standardOut);
        outputStreamCaptor.reset();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void postOrderTraversal(){
        bst.postOrderTraversal(bst.root);
        assertEquals( "3\r\n7\r\n7\r\n18\r\n14\r\n12", outputStreamCaptor.toString().trim());
    }
    @After
    public void reset2() {
        System.setOut(standardOut);
        outputStreamCaptor.reset();
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @Test
    public void inOrderTraversal(){
        bst.inOrderTraversal(bst.root);
        assertEquals( "3\r\n7\r\n7\r\n12\r\n14\r\n18", outputStreamCaptor.toString().trim());
    }
    @After
    public void reset3() {
        System.setOut(standardOut);
        outputStreamCaptor.reset();
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @AfterClass
    public static void reset4() {
        System.setOut(standardOut);
        outputStreamCaptor.reset();
        System.setOut(new PrintStream(outputStreamCaptor));
    }








}