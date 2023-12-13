
import java.util.Arrays;
import java.util.Random;
//Ïimport java.util.Arrays;

public class SelectAndSortTest {

    public SelectAndSortTest(int arraySize) {
        Random run = new Random();
        SelectAndSort sas = new SelectAndSort();

        int arr[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = run.nextInt(10);
        }
        sas.selectArray(arr);
    }

    public static void main(String[] args) {
        new SelectAndSortTest(10).validate();
        for (int size = 10000; size <= 200000; size += 10000) {
            Long start = System.currentTimeMillis();
            SelectAndSortTest test = new SelectAndSortTest(size);
            Long end = System.currentTimeMillis();
            int n = (int) (end - start);
            System.out.println(n);
            //  System.out.println("Time in miliseconds " + n);
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

        SelectAndSort sorter = new SelectAndSort();
        sorter.selectArray(num);

        System.out.println("after");

        printArr(num);
    }

    public void printArr(int[] num) {
        System.out.println(Arrays.toString(num));
    }
}
