
package com.mycompany.sorting;

//Mergesort, O(n*log(n)) avg time complexity
//Divide array into n sub-arrays, each of which is one element and is sorted
//Merge the sorted sub-arrays into one array

public class MergeSort {
    public static void sort(int[] array){
       mergeSort(array, 0, array.length-1);
    }
    
    private static void mergeSort(int[] array, int left, int right){
        if (left < right){
            int middle = (left + right) / 2;
            
            //recusrively sort first and second halves
            mergeSort(array, left, middle);
            mergeSort(array, middle+1, right);
            
            //merge sorted halves
            merge(array, left, middle, right);
        }
    }
    
    private static void merge(int[] array, int left, int middle, int right){
        //sizes of two sub-arrays to be merged
        int size1 = middle - left + 1;
        int size2 = right - middle;
        
        //temp arrays
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];
        
        //copy from main array into temp arrays
        for (int i = 0; i < size1; ++i){
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < size2; ++j){
            rightArray[j] = array[middle + j + 1];
        }
        
        //merge temp arrays
        int leftIndex = 0, rightIndex = 0;
        int mainIndex = left;
        while (leftIndex < size1 && rightIndex < size2){
            if ( leftArray[leftIndex] <= rightArray[rightIndex]){
                array[mainIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else {
                array[mainIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            mainIndex++;
        }
        
        //copy remaining elements of left array
        while (leftIndex < size1){
            array[mainIndex] = leftArray[leftIndex];
            leftIndex++;
            mainIndex++;
        }
        
        //copy remaining elements of right array
        while (rightIndex  < size2){
            array[mainIndex] = rightArray[rightIndex];
            rightIndex++;
            mainIndex++;
        }
    }
}
