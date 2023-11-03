package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {12, 2, 43, 1, 7, 54, 0};
        BubbleSort.sort(array);
        Main.printArray(array);

        int[] array1 = {132, 13, 65, 7, 1, 101, 40};
        SelectionSort.sort(array1);
        Main.printArray(array1);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}
