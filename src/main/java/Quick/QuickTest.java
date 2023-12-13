package Quick;


import java.util.Random;
import java.util.Arrays;

public class QuickTest {
    
    public QuickTest(int arraySize) {    
        
        Random num = new Random();
        QuickSort sorter = new QuickSort();

        int arr[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = num.nextInt(100);
        }
        sorter.quickSorter(arr, 0, arr.length - 1);
        
    }

    public static void main(String[] args) {
        new QuickTest(10).validate();
        
        for (int size = 10000; size <= 200000; size += 10000) {
            
            long start = System.currentTimeMillis();
            new QuickTest(size);  
            long end = System.currentTimeMillis();
            
            int n = (int) (end - start);
            System.out.println(n);
        }
    }
    
    
    
    
   public void validate() {
        Random ran = new Random();
        int[] num = new int[10];
        int i;

        for (i = 0; i < num.length; i++) {
            num[i] = ran.nextInt(100);
        }
        System.out.println("before");
        printArr(num);

        QuickSort sorter = new QuickSort();
        sorter.quickSorter(num, 0, num.length - 1);

        System.out.println("after");

        printArr(num);
    }

  
    public void printArr(int[] num) {
      System.out.println(Arrays.toString(num));
}
    }

