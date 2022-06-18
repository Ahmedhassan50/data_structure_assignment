package com.example.sort;


/**
 * Created by Ahmed Hassan
 */

public class MergeSort implements SortAlgorithm{


    /**
     * method for sort Integer Array
     *
     * @param arr Integer Array to be sorted
     * @return sorted Integer Array
     */

    @Override
    public int[] sort(int[] arr) {
        mergeSort(arr);

        return arr;
    }
    private void mergeSort(int[] arrayInput){
        int arrSize = arrayInput.length;

        if(arrSize<2){
            return;
        }
        int midIndex = arrSize/2;
        int[] arr1 = new int[midIndex];
        int[] arr2 = new int[arrSize-midIndex];

        for (int i=0; i<midIndex;i++){
            arr1[i]=arrayInput[i];
        }

        for (int i=midIndex; i<arrSize;i++){
            arr2[i-midIndex]=arrayInput[i];
        }

        mergeSort(arr1);
        mergeSort(arr2);
        merge(arrayInput,arr1,arr2);
    }

    private void merge(int []mergedArray ,int[] arr1, int[] arr2){

        int arr1Size = arr1.length;
        int arr2Size = arr2.length;

        int i =0 ;int j=0; int k=0;


        while (i<arr1Size && j<arr2Size){
            if(arr1[i]<=arr2[j]){
                mergedArray[k]=arr1[i];
                i++;
            }else {
                mergedArray[k]=arr2[j];
                j++;
            }
            k++;
        }

        while (i<arr1Size){
            mergedArray[k] =arr1[i];
            i++;
            k++;
        }
        while (j < arr2Size){
            mergedArray[k] =arr2[j];
            j++;
            k++;
        }





    }
}