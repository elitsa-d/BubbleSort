package com.company;


// Time complexity: O(nlogn)
// Space complexity: O(n)

public class QuickSort {
    private static int partition(int[] array, int start, int end) {
        int pivot = end;
        int i = start -1;

        for (int j = start; j <= end; j++) {
            if (array[j] <= array[pivot]) {
                i++;
                int temp = array[i];
                array[i] = array[j];;
                array[j] = temp;
            }
        }

        return i;
    }

    public static void sort(int[] array, int beginIndex, int endIndex) {
        if (beginIndex < endIndex) {
            int pivot = partition(array, beginIndex, endIndex);
            sort(array, beginIndex, pivot - 1);
            sort(array,pivot + 1, endIndex);
        }
    }
}
