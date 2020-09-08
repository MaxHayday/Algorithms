package com.max_hayday.algorithms;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Given array of integers.Create and implement a method that will fing  if array contains duplicates of numbers.
 * Example:
 * array = [4,5,6,6,8]
 * Result: true;
 * Number 6 repeats 2 times.
 * array = [4,5,6,7,8]
 * Result: false;
 * No duplicates.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{4, 5, 6, 7, 8};
        int[] array2 = new int[]{4, 5, 6, 6, 8};
        System.out.println(findDuplicatesInArrayUsingTreeSet(array1));
    }

    public static boolean findDuplicatesInArrayUsingTreeSet(int[] array) {
        TreeSet treeSet = new TreeSet();
        for (int i = 1; i <= array.length - 1; i++) {
            treeSet.add(array[i]);
            if (i > treeSet.size())
                return true;
        }
        return false;
    }
}
