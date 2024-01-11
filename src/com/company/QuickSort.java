package com.company;

public class QuickSort {
    public static void sort(int[] array) {
        int pivot = array.length - 1;
        int leftPointer = 0;
        int rightPointer = array.length - 2;

        while (array[leftPointer] < array[pivot]) {
            leftPointer++;
        }

        while (array[rightPointer] >= array[pivot]) {
            rightPointer--;

            if (rightPointer == leftPointer) {
                int temp = array[leftPointer];
                array[leftPointer] = array[pivot];
                array[pivot] = temp;
            }
        }

        int temp = array[leftPointer];
        array[leftPointer] = array[rightPointer];
        array[rightPointer] = temp;


    }
}
