
package com.mycompany.sorting;

//Insertion sort, O(n^2) avg time complexity
//Take element from unsorted part, find correct spot in sort part, swap it into sorted part

public class InsertionSort {
    //interative insertion sort
     public static void sort(int[] array){
         //loop through, started at second element of array
       for (int i = 1; i < array.length; i++){
          //take the next element, compare it to the elements behind it
          int currElement = array[i];
          int currIndex = i - 1;
          //while elements behind are greater than current element, swap greater ones ahead
          while ( currIndex >= 0 && array[currIndex] > currElement){
              array[currIndex + 1] = array[currIndex];
              currIndex -= 1;
          }
          array[currIndex + 1] = currElement;
       }
    }
     
     public static void sort(int[] array, boolean isRecursive){
         if (isRecursive){
             sortRecursive(array, array.length);
         }
         else{
             sort(array);
         }
     }
     
     public static void sortRecursive(int[] array, int size){
         //base case
         if (size <= 1){
             return;
         }
         
         //sort size-1 elements
         sortRecursive(array, size-1);
         
         //insert last element at the correct position in the sorted array
         int lastElement = array[size-1];
         int prevIndex = size-2;
         
         while (prevIndex >= 0 && array[prevIndex] > lastElement){
             array[prevIndex+1] = array[prevIndex];
             prevIndex--;
         }
         array[prevIndex+1] = lastElement;
     }
}
