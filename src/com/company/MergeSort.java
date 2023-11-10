package com.company;

public class MergeSort {

    private static void merge(int[] array, int beginIndex, int middleIndex, int endIndex) {
        int leftLength = middleIndex - beginIndex + 2;
        int rightLength = endIndex - middleIndex + 1;
        int[] leftHalf = new int[leftLength];
        int[] rightHalf = new int[rightLength];

        int current = beginIndex;
        for (int i = 0; current <= middleIndex; i++, current++) {
            leftHalf[i] = array[current];
        }

        for (int i = 0; current <= endIndex; i++, current++) {
            rightHalf[i] = array[current];
        }

        leftHalf[leftLength - 1] = Integer.MAX_VALUE;
        rightHalf[rightLength - 1] = Integer.MAX_VALUE;
        int leftIndex = 0;
        int rightIndex = 0;

        for (current = beginIndex; current <= endIndex; current++) {
            if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                array[current] = leftHalf[leftIndex];
                leftIndex++;
            } else {
                array[current] = rightHalf[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void sort(int[] array, int beginIndex, int endIndex) {
        if (endIndex > beginIndex) {
            int middleIndex = (beginIndex + endIndex) / 2;
            sort(array, beginIndex, middleIndex);
            sort(array, middleIndex + 1, endIndex);
            merge(array, beginIndex, middleIndex, endIndex);
        }
    }
}
