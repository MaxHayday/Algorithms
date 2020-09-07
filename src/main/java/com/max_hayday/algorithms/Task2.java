package com.max_hayday.algorithms;

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
        int[] array = new int[]{4, 5, 6, 6, 8};
        System.out.println(findDuplicatesInArray(array));
    }

    public static boolean findDuplicatesInArray(int[] array) {
        int i = 0;
        while (i != array.length - 1) {
            if (array[i] == array[i + 1]) {
                return true;
            }
            i++;
        }
        return false;
    }
}
