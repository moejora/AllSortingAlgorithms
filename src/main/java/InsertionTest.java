
import java.util.Arrays;
import java.util.Random;

public class InsertionTest {

    public InsertionTest(int arraySize) {

        Random num = new Random();
        InsetionSort sorta = new InsetionSort();

        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = num.nextInt(10);
        }
        sorta.insertionSort(array);

    }

    public static void main(String[] args) {
        new InsertionTest(10).validate();
        for (int size = 10000; size <= 200000; size += 10000) {
            Long start = System.currentTimeMillis();
            InsertionTest test = new InsertionTest(size);
            Long end = System.currentTimeMillis();

            int n = (int) (end - start);
             System.out.println(n);
            //System.out.println(size + "Time in miliseconds " + n);
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

        InsetionSort sorter = new InsetionSort();
        sorter.insertionSort(num);

        System.out.println("after");

        printArr(num);
    }

  
    public void printArr(int[] num) {
      System.out.println(Arrays.toString(num));
}
    }
