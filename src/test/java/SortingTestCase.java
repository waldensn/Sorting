
import org.junit.*;
import static org.junit.Assert.*;
import com.mycompany.sorting.*;

public class SortingTestCase {
    int[] unsortedArray;
    int[] sortedArray;
    
    @Before
    public void setUpClass() {
        unsortedArray = new int[] {2, 82, 6, 36, 68, 20, 88, 2, 12, 78, 9, 55, 41, 2, 20, 71, 18};
        sortedArray = new int[] {2, 2, 2, 6, 9, 12, 18, 20, 20, 36, 41, 55, 68, 71, 78, 82, 88};
    }
    
    @Test
    public void testBubbleSort(){
        BubbleSort.sort(unsortedArray);
        Assert.assertArrayEquals(unsortedArray, sortedArray);
    }
    
    @Test
    public void testBubbleSortRecursive(){
        BubbleSort.sort(unsortedArray, true);
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
    public void testInsertionSortRecusive(){
        InsertionSort.sort(unsortedArray, true);
        Assert.assertArrayEquals(unsortedArray, sortedArray);
    }
    
    @Test
    public void testCountingSort(){
        CountingSort.sort(unsortedArray);
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
