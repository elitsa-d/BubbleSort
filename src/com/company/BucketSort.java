package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void sort(int[] array) {
         int numberOfBuckets = (int) Math.ceil(Math.sqrt(array.length));
         int maxValue = Integer.MIN_VALUE;

         for (int value : array) {
             if (value > maxValue) {
                  maxValue = value;
             }
         }

         ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
         for (int i = 0; i < buckets.length; i++) {
             buckets[i] = new ArrayList<>();
         }

         for (int value : array) {
             int bucketNumber = (int) Math.ceil(((float) value * numberOfBuckets) / (float) maxValue);
             buckets[bucketNumber - 1].add(value);
         }

         for (ArrayList<Integer> bucket : buckets) {
             Collections.sort(bucket);
         }

         int index = 0;

         for (ArrayList<Integer> bucket : buckets) {
             for (int value : bucket) {
                array[index] = value;
                index++;
             }
         }
    }
}
