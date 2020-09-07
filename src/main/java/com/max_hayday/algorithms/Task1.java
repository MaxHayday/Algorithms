package com.max_hayday.algorithms;

/**
 * Given array of integers. Create and implement a method that returns an indexes of array whose values add up to the number.
 * It is assumed that the array contains only unique numbers and always has the desired numbers.
 * The same element cannot be used twice.
 * array = [3, 8, 15, 17], Number = 23
 * <p>
 * result = [1,2]
 * Indices 1 and 2 (value 8 and 15) add up to the required number 23
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 8, 15, 17};
        int[] ar = findIndexesOfArrayWhoseValuesAddUpTheNumber(array, 23);
        for (int i :
                ar) {
            System.out.println(i);
        }
    }

    public static int[] findIndexesOfArrayWhoseValuesAddUpTheNumber(int[] array, int number) {
        int i = 0, j = array.length - 1;
        int[] result = new int[2];
        while (i != j) {
            int value = array[i] + array[j];
            if (value < number) {
                i++;
            }
            if (value > number) {
                j--;
            }
            if (value == number) {
                result[0] = i;
                result[1] = j;
                return result;
            }
        }

        return result;
    }
}
