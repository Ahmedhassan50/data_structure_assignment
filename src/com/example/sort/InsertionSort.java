package com.example.sort;


/**
 * Created by Ahmed Hassan
 */

public class InsertionSort implements SortAlgorithm{



    /**
     * method for sort Integer Array
     *
     * @param arr Integer Array to be sorted
     * @return sorted Integer Array
     */
    @Override
    public int[] sort(int[] arr) {


        for (int i =0;i<arr.length-1;i++){
        if(arr[i+1]<arr[i]){
            for (int j =i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                }else {
                    break;
                }
            }
        }
        }

        return arr;
    }

}
