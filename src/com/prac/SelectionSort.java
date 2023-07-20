package com.prac;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minNumIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minNumIdx]) {
                    minNumIdx = j;
                }
            int temp = arr[i];
            arr[i] = arr[minNumIdx];
            arr[minNumIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 3, 7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}