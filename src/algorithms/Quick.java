package src.algorithms;

import src.interfaces.Sorter;
//import src.utils.ArrayHandler;
import src.utils.ArrayHandler;

public class Quick implements Sorter {
    // method to find the partition position
    private int partition(int array[], int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                ArrayHandler.swap(array, i, j);

            }

        }

        // swapt the pivot element with the greater element specified by i
        ArrayHandler.swap(array, i + 1, high);

        // return the position from where partition is done
        return (i + 1);
    }

    private void quickSort(int array[], int low, int high) {
        if (low < high) {

            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }

    public void sortArray(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

    }

    @Override
    public void bestCase(int[] arr) {
        // Best Case is when the pivot element divides the list into two equal halves by
        // coming exactly in the middle position.
        partition(arr, 0, arr.length - 1);

    }

    @Override
    public void worstCase(int[] arr) {
        // Already sorted worst case occurs when the pivot element is either greatest or
        // smallest element.
        // The current implementation will already perform the worstcase when the array
        // is already sorted
        sortArray(arr);

    }
}
