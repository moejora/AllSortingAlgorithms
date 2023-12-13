package Bubble;


import java.util.Arrays;
import java.util.Random;

public class BubbleTest {

    public BubbleTest(int arraySize) {

        Random num = new Random();
        BubbleSort sorta = new BubbleSort();

        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = num.nextInt(10);
        }
        sorta.bubbleSort(array);

    }

    public static void main(String[] args) {
        new BubbleTest(10).validate();

        for (int size = 10000; size <= 200000; size += 10000) {
            Long start = System.currentTimeMillis();
            BubbleTest test = new BubbleTest(size);
            Long end = System.currentTimeMillis();

            int n = (int) (end - start);
            System.out.println(n);
            //System.out.println("Time in miliseconds " + n);
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

        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(num);

        System.out.println("after");

        printArr(num);
    }

  
    public void printArr(int[] num) {
      System.out.println(Arrays.toString(num));
}
}
