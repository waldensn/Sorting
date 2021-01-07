
package com.mycompany.sorting;

//Bubble sort, O(n^2) avg time complexity
//Loop through array twice, swapping larger numbers to the end

public class BubbleSort {
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
}
