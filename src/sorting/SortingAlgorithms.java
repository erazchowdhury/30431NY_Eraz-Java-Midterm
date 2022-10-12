package sorting;

import databases.SharedStepsDatabase;

import java.util.ArrayList;
import java.util.List;

public class SortingAlgorithms {


    /** INSTRUCTIONS
     * You must implement all of the sorting algorithms below. Feel free to add any helper methods that you may need,
     * but make sure they are private, as to not be accessed outside of this class.
     *
     * You must also store the sorted arrays into their own individual database tables (Selection Sort should be stored
     *  in table `selection_sort`, Insertion Sort should be stored in table `insertion_sort`)
     */

    long executionTime = 0;

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    SharedStepsDatabase ssdb = new SharedStepsDatabase();

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

//        List<Object> selectionSortingList = new ArrayList<>();
//        for (int i : array)
//        {
//            selectionSortingList.add(i);
//        }

//        ssdb.insertList("selection_sort", "selection_sort_values", selectionSortingList);

        return array;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        // IMPLEMENT HERE

        int length = array.length;
        for (int i = 1; i < length; ++i) {
            int numBeingCompared = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > numBeingCompared) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = numBeingCompared;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] bubbleSort(int[] array) {
        // IMPLEMENT HERE

        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

        return array;
    }

    public int[] mergeSort(int[] array) {
        // IMPLEMENT HERE

        return array;
    }

    public int[] quickSort(int[] array) {
        // IMPLEMENT HERE

        return array;
    }

    public int[] heapSort(int[] array) {
        // IMPLEMENT HERE

        return array;
    }

    public int[] bucketSort(int[] array) {
        //implement here

        return array;
    }

    public int[] shellSort(int[] array) {
        //implement here

        return array;
    }
}
