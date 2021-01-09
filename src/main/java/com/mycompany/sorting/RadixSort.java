
package com.mycompany.sorting;

//Radix sort, worst case O(w*n) where w is number of bits to store each key

import java.util.Arrays;

//Similar to counting sort

public class RadixSort {
    public static void sort(int[] array){
        radixSort(array, array.length);
    }
    
    private static void radixSort(int[] array, int size){
        int max = getMax(array, size);
        
        //do counting sort for each digit
        //exp is 10^i where i is the current digit number
        //ones place is i = 0 exp = 1, tens place is i = 1 exp = 10, etc 
        for(int exp = 1; max / exp > 0; exp *= 10){
            countSort(array, size, exp);
        }
    }
    
    //do counting sort of array according to digit represented by exp
    private static void countSort(int[] array, int size, int exp){
        int output[] = new int[size];
        int count[] = new int[10];
        Arrays.fill(count, 0);
        
        //store count of occurances in count array
        //countIndex is 0 to 9
        for (int i = 0; i < size; i++){
            int countIndex = (array[i] / exp) % 10;
            count[countIndex]++;
        }
        
        //change count[i] so it now contains actual position of this digit in output[]
        for (int i = 1; i < 10; i++){
            count[i] += count[i-1];
        }
        
        //build the output array 
        for (int i = size - 1; i >= 0; i--) { 
            int countIndex = (array[i] / exp) % 10;
            output[count[countIndex] - 1] = array[i]; 
            count[countIndex]--; 
        } 
        
        //copy output array into array[]
        System.arraycopy(output, 0, array, 0, array.length);
    }
    
    //get maximum value in array
    private static int getMax(int[] array, int size){
        int max = array[0];
        for (int i = 1; i < size; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
