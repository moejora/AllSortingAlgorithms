package Insertion;

/*
We will write a program (InsertsIntoSort())

Write a method that loops through an array 
It takes the most recent one and swaps ut leftwards until its in the correct position
Iterate forward once, repeat until list is sorted

[5][2][8][1][4][6]
[5][2][8][1][4][6]
[5][2][8][1][4][6]
[5][2][8][1][4][6]
 */

public class InsetionSort {

    public void insertionSort(int[] arr) {
        int n = arr.length;
        int i = 1;

        while (i < n) {
            int temp = arr[i];
            int j = i - 1; //j is the indext when i - 1

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
            i++;
        }

    }
/*
    public void newArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "");
        }
    }

    */
    

}
