
package com.mycompany.sorting;

//Selection sort, O(n^2) avg time complexity
//Find the smallest element in the unsorted part of the array, and swap it into the correct spot

public class SelectionSort {
    public static void sort(int[] array){
        //i is the boundary between sorted part and unsorted part
        for (int i = 0; i < array.length; i++){
            int minIndex = i;
            //find the smallest value in the unsorted part
            for (int j = i+1; j < array.length; j++){
                if ( array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            //swap the smallest value into the current spot
            SortUtils.swap(array, i, minIndex);
        }
    }
}
