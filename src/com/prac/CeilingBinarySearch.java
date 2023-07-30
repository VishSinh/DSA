package com.prac;

public class CeilingBinarySearch {
    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] < target) start = middle + 1;
            else if (arr[middle] > target) end = middle - 1;
            else return arr[middle];
        }
        return start == arr.length ? -1 : arr[start];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceil(arr, 10));
    }
}
