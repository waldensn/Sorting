
package com.mycompany.sorting;

//Common functions for sorting
public class SortUtils {
    //swap int at position a and b
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
