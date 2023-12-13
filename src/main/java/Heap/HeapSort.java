package Heap;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {

    public int[] array;

    public HeapSort(int arraySize) {
        this.array = new int[arraySize];
        Random rand = new Random();

        // int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(100);
        }
        sort();
    }

    public static void main(String[] args) {

        HeapSort heapSort = new HeapSort(10);
        heapSort.validate();

        for (int size = 10000; size <= 200000; size += 10000) {
            Long start = System.currentTimeMillis();
            new HeapSort(size);
            Long end = System.currentTimeMillis();
            int n = (int) (end - start);
            System.out.println(n);
        }
    }

    public void sort() {
        MaxHeap maxHeap = new MaxHeap();

        for (int i = 0; i < this.array.length; i++) {
            int num = this.array[i];
            maxHeap.add(num);

        }
        for (int i = this.array.length - 1; i >= 0; i--) {
            this.array[i] = maxHeap.poll();
        }

    }

    public void validate() {
        Random ran = new Random();
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = ran.nextInt(100);
        }
        System.out.println("before");
        printArr(num);

        this.array = num;
        sort();

        System.out.println("after");

        printArr(this.array);
    }

    public void printArr(int[] num) {
        System.out.println(Arrays.toString(num));
    }
}

//https://www.youtube.com/watch?v=WCEeum-qCtI&t=208s
//https://www.youtube.com/watch?v=t0Cq6tVNRBA
