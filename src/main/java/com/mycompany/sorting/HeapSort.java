
package com.mycompany.sorting;

//Heap sort, O(n*log(n)) avg time complexity
//improved form of selection sort
//divides array into sorted and unsorted sections, keeps the unsorted part in a max heap data structure

public class HeapSort {
    public static void sort(int[] array){
        //build array into heap
        for (int i = (array.length / 2) - 1; i >= 0; i--){
            heapify(array, array.length, i);
        }
        
        //extract elements from heap
        for (int i = array.length - 1; i > 0; i--) {
            //put the heap root, the largest value, at the end of the array
            SortUtils.swap(array, 0, i);
            
            //heapify the unsorted part
            heapify(array, i, 0);
        }
    }
    
    private static void heapify(int[] array, int size, int root){
        int largest = root;
        int left = 2*root + 1;
        int right = 2*root + 2;
        
        //left child larger than root
        if ( left < size && array[left] > array[largest]){
            largest = left;
        }
        
        //right child larger than largest so far
        if ( right < size && array[right] > array[largest]){
            largest = right;
        }
        
        //if largest is not root
        if ( largest != root ){              
            //swap largest and root
            SortUtils.swap(array, root, largest);
            
            //recursively heapify the subtree
            heapify(array, size, largest);
        }
    }
}
