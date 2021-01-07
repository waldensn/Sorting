
package com.mycompany.sorting;

//Bubble sort, O(n^2) avg time complexity
//Loop through array twice, swapping larger numbers to the end

public class BubbleSort {
    //iterative bubble sort
    public static void sort(int[] array){
        //always loop through entire array twice, very inefficient
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1; j++){
                //if current num is greater than next num, swap current one towards end
                if ( array[j] > array[j+1] ){
                    SortUtils.swap(array, j, j+1);
                }
            }
        }
    }
    
    public static void sort(int[] array, boolean isRecursive){
        if ( isRecursive ){
            sortRecursive(array, array.length);
        }
        else{
            sort(array);
        }
    }
    
    private static void sortRecursive(int[] array, int size){
        //base case, size of array to sort is 1
        if (size == 1){
            return;
        }
        
        //swap largest element to end
        for (int i = 0; i < size-1; i++){
            if (array[i] > array[i+1]){
                SortUtils.swap(array, i, i+1);
            }
        }
        
        //largest element is at end, recur over the rest of the array
        sortRecursive(array, size-1);
    }
}
