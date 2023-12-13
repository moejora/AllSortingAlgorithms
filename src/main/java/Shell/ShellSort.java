package Shell;


public class ShellSort {

    public void shellSort(int arr[]) {
        int n = arr.length;
        int gap = n / 2;

        while (gap > 0) {
            int i = gap;
            while (i < n) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
                i++;
            }
            gap /= 2;
        }
    }
}
