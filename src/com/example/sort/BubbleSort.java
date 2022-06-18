package com.example.sort;


/**
 * Created by Ahmed Hassan
 */

public class BubbleSort implements SortAlgorithm{


    /**
     * method for sort Integer Array
     *
     * @param arr Integer Array to be sorted
     * @return sorted Integer Array
     */
    @Override
    public int [] sort(int [] arr){
        boolean repeat;

        do {
            repeat = false;
            for(int i = 0; i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1] =temp;
                    repeat = true;
                }
            }
        }while (repeat);

        return arr;
    }


}
