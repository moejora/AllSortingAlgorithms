package Merge;

/*
11-8-23
(Merge sort // uses recursion)
1. Split array in half
- make 2 arrays √
- make one array from size 0 - n/2 √
- make one array from size n/2 until size length 

2. sort left array
- call sort on left

3. Sort right array
- call sort on right

4. merge
- create a temp array
- compare the left most value of both sub arrays 
- move the lower of the 2 and increment 
- loop until both sub-arrays are done
-print new array


(After showed work(fix 1 and step 4))
 */

public class MergeSort {

    // Main method for dividing and merging the array
    public void mergeNums(int[] arr) {
        // Base case: If the array has 1 element or is empty, it's already sorted
        if (arr.length <= 1) {
            return;
        }

        // Divide the array into two halves
        int n = arr.length;
        int half = n / 2;
        int left[] = new int[half];
        int right[] = new int[n - half];

        // Copy elements to the left and right arrays
        for (int i = 0; i < half; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < n - half; i++) {
            right[i] = arr[half + i];
        }

        // Recursively call mergeNums on the left and right halves
        mergeNums(left);
        mergeNums(right);

        // Merge the sorted left and right halves back into the original array
        merge(left, right, arr);
    }

    // method to merge two sorted arrays into a third array
    public void merge(int left[], int right[], int[] tmp) {
        int i = 0;
        int m = 0;
        int k = 0;

        // Compare values from left and right arrays and merge them into the tmp array
        while (i < left.length && m < right.length) {
            if (left[i] <= right[m]) {
                tmp[k] = left[i];
                i++;
            } else {
                tmp[k] = right[m];
                m++;
            }
            k++;
        }

        // Copy any of the other value from the left array
        while (i < left.length) {
            tmp[k] = left[i];
            i++;
            k++;
        }

        // Copy any of the other values from the right array
        while (m < right.length) {
            tmp[k] = right[m];
            m++;
            k++;
        }
    }
}
