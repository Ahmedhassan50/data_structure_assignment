package com.example.sort;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    private BubbleSort bubbleSort;
    private InsertionSort insertionSort;
    private MergeSort mergeSort;


    @Before
    public void  initBubble(){
        bubbleSort = new BubbleSort();
    }

    @Test
    public void bubbleSortTest(){
        int []arr = {4,6,2,3,1,5};
        int [] sortedArr = bubbleSort.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5,6},sortedArr);
    }



    @Before
    public void  initInsertion(){
        insertionSort = new InsertionSort();
    }

    @Test
    public void InsertionSortTest(){
        int []arr = {4,6,2,3,1,5};
        int [] sortedArr = insertionSort.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5,6},sortedArr);
    }



    @Before
    public void  initMerge(){
        mergeSort = new MergeSort();
    }

    @Test
    public void MergeSortTest(){
        int []arr = {4,6,2,3,1,5};
        int [] sortedArr = mergeSort.sort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5,6},sortedArr);
    }

}