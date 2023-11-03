package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {12, 2, 43, 1, 7, 54, 0};
        BubbleSort.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
