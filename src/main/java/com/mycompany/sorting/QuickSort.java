
package com.mycompany.sorting;

//Quick sort, O(n*log(n)) avg time complexity
//Pick pivot value, partition array into sub-arrays, whether or not they are less than or greater than the pivot value
//Then recursively sort the sub-arrays

public class QuickSort {
    public static void sort(int[] array){
        quickSort(array, 0, array.length-1);
    }
    
    private static void quickSort(int[] array, int low, int high){
        if ( low < high ){
            //pivot is the index of the partition
            //array[pivot] is at the correct spot in the array
            int pivot = partition(array, low, high);
            
            quickSort(array, low, pivot-1);
            quickSort(array, pivot+1, high);
        }
                
    }
    
    //take the element at the end of the subarray as the pivot
    //place pivot at the correct spot in the subarray
    //swap all elements smaller than pivot to the left, elements greater than pivot to the right
    private static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int indexSmaller = low-1;
        
        //loop through array from low to high
        for ( int j = low; j < high; j++){
            //if current element less than pivot, then swap
            if (array[j] < pivot){
                indexSmaller++;
                SortUtils.swap(array, indexSmaller, j);
            }
        }
        
        //swap pivot into correct spot
        SortUtils.swap(array, indexSmaller+1, high);
        //return index of pivot
        return indexSmaller+1;
    }
      
}
