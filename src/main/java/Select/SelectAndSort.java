package Select;

//import java.util.Iterator;
/*
-Write a program
It will selectAndSort()

-The goal is to sort an array similar to how you would arrange cards in a hand

-Write a method that accepts an array

-Loop through the array 

-It will take the lowest element in the array and move it to the left 

-Iterate one over, Take the next lowest, place it after the first

-Repeat until complete
 */
public class SelectAndSort {
//Method that creats my array "arr"

    public void selectArray(int[] arr) {

        int n = arr.length; // n = to the length of the array
        for (int i = 0; i < n - 1; i++) { //Starting at 0 when i < the lendth -1 
            int least = i; //the least int is set to i to use in next for loop

            for (int j = i + 1; j < n; j++) { //new int j is = i+1,  J is less than the length  so J will continue
                if (arr[j] < arr[least]) {// if my J array < array of the least int V
                    least = j; // swap j to least
                }
            }
            int temp = arr[i]; //temp array is set to my arr[i]
            arr[i] = arr[least];
            arr[least] = temp;
        }
    }
}
