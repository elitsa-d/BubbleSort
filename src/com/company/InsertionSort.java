package com.company;


// Time complexity: O(n^2)
// Space complexity: O(1)

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentNum = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > currentNum) {
                array[j] = array[j - 1];
                j--;
            }

            array[j] = currentNum;
        }
    }
}
