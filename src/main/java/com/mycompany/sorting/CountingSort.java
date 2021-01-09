
package com.mycompany.sorting;

//counting sort, worst case is O(n+k) where k is the range of the keys

import java.util.Arrays;

//non-comparitive sorting algorithm

public class CountingSort {
    public static void sort(int[] array){
        int[] output = new int[array.length+1];
        
        //for example, array to sort is [4 2 2 8 3 3 1]
        
        //get max element of array, max is 8
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if ( array[i] > max ){
                max = array[i];
            }
        }
        
        //create and fill count array with zeroes, 9 total elements in count
        //count is [0 0 0 0 0 0 0 0 0]
        int[] count = new int[max+1];
        Arrays.fill(count, 0);
        
        //store count of each element
        //if the number 3 in array occurs twice, then store 2 in index 3 of count array
        //count array would be [0 1 2 2 1 0 0 0 1]
        //the number 1 occurs once, 2 occurs twice, 3 occurs twice, 4 occurs once, 8 occurs once
        for ( int i = 0; i < array.length; i++){
            count[array[i]]++;
        }
        
        //store cumulative count of the elements in the count array, helps when placing the elements
        //count array would be [0 1 3 5 6 6 6 6 7]
        for (int i = 1; i <= max; i++){
            count[i] += count[i-1];
        }
        
        //find index of each element of the original array in the count array
        //place elements in the output array
        //in the first index of original array is 4
        //index 4 of the count array is 6
        //number 4 belongs at the 6-1=5 index of the output array
        for (int i = array.length - 1; i >= 0; i--){
            int sortedIndex = count[array[i]] - 1;
            output[sortedIndex] = array[i];
            count[array[i]]--;
        }
        
        //copy sorted elements into original array
        System.arraycopy(output, 0, array, 0, array.length);
    }
}
