
import java.util.Arrays;


//import java.util.Random;

public class QuickSort {
    
public void quickSorter(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSorter(arr, low, pivotIndex - 1);
            quickSorter(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        int pivotIndex = getMedianOfThree(arr, low, mid, high);

        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, high);

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivotValue) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private int getMedianOfThree(int[] arr, int low, int mid, int high) {
        int[] values = { arr[low], arr[mid], arr[high] };
        Arrays.sort(values);
        if (values[1] == arr[low]) return low;
        else if (values[1] == arr[mid]) return mid;
        else return high;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}