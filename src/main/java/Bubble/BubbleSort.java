package Bubble;

public class BubbleSort {

  //  int count = 0;

    public void bubbleSort(int[] array) {

        int n = array.length;
        int i = 0;

        while (i < n - 1) {
            int c = 0;

            while (c < n - i - 1) {
                if (array[c] > array[c + 1]) {
                    int temp = array[c];
                    array[c] = array[c + 1];
                    array[c + 1] = temp;
                }
            //   count++;
                c++;
            }

          //  count++;
            i++;
        }
      //  System.out.println(count);
    }

    public void newArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.println(array[i] + " ");
        }
        //    System.out.println();
    }
}
