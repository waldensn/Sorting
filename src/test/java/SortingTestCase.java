/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;
import com.mycompany.sorting.*;

/**
 *
 * @author walde
 */
public class SortingTestCase {
    int[] unsortedArray;
    int[] sortedArray;
    
    @Before
    public void setUpClass() {
        unsortedArray = new int[] {82, 6, 36, 68, 12, 78, 9, 55, 41, 2, 20, 71, 18};
        sortedArray = new int[] {2, 6, 9, 12, 18, 20, 36, 41, 55, 68, 71, 78, 82};
    }
    
    @Test
    public void testBubbleSort(){
        BubbleSort.sort(unsortedArray);
        Assert.assertArrayEquals(unsortedArray, sortedArray);
    }
    
    @Test
    public void testSelectionSort(){
        SelectionSort.sort(unsortedArray);
        Assert.assertArrayEquals(unsortedArray, sortedArray);
    }
    
    @Test
    public void testInsertionSort(){
        InsertionSort.sort(unsortedArray);
        Assert.assertArrayEquals(unsortedArray, sortedArray);
    }
    
    @Test
    public void testQuickSort(){
        QuickSort.sort(unsortedArray);
        Assert.assertArrayEquals(unsortedArray, sortedArray);
    }
    
    @Test
    public void testMergeSort(){
        MergeSort.sort(unsortedArray);
        Assert.assertArrayEquals(unsortedArray, sortedArray);
    }
    
    @Test
    public void testHeapSort(){
        HeapSort.sort(unsortedArray);
        Assert.assertArrayEquals(unsortedArray, sortedArray);
    }
}
