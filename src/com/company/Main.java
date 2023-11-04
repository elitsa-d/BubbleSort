package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {12, 2, 43, 1, 7, 54, 0};
        BubbleSort.sort(array);
        Main.printArray(array);

        int[] array1 = {132, 13, 65, 7, 1, 101, 40};
        SelectionSort.sort(array1);
        Main.printArray(array1);

        int[] array2 = {2, 1, 6, 43, 1, 32, 17};
        InsertionSort.sort(array2);
        Main.printArray(array2);

        int[] array3 = {8, 11, 9, 1, 3, 6, 7};
        BucketSort.sort(array3);
        Main.printArray(array3);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}
