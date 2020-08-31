package org.nordstrom.sortingalgorithms;

public class InsertionSort {

    public static int[] sort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0 && list[j - 1] > list[j]; j--) {
                swap(list, j, j - 1);
            }
        }
        return list;
    }

    private static void swap(int[] list, int indexA, int indexB) {
        int value = list[indexA];
        list[indexA] = list[indexB];
        list[indexB] = value;
    }

}
