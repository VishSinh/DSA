package com.prac;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 3, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}