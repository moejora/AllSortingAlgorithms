package Merge;


import java.util.Arrays;
import java.util.Random;

public class MergeTest {

    public MergeTest(int arraySize) {
        Random num = new Random();
        MergeSort mrg = new MergeSort();

        int arr[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = num.nextInt(100);
        }
        mrg.mergeNums(arr);
    }

    public static void main(String[] args) {
        new MergeTest(10).validate();

        for (int size = 10000; size <= 200000; size += 10000) {
            Long start = System.currentTimeMillis();
            MergeTest test = new MergeTest(size);
            Long end = System.currentTimeMillis();
            //    System.out.println(size);
            int n = (int) +(end - start);
            System.out.println(n);
            //   System.out.println("Time in miliseconds " + n);
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

        MergeSort sorter = new MergeSort();
        sorter.mergeNums(num);

        System.out.println("after");

        printArr(num);
    }

    public void printArr(int[] num) {
        System.out.println(Arrays.toString(num));
    }
}
