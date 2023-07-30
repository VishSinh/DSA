package com.prac;

public class BinarySearch {

    static int recursiveBinarySearch(int[] arr, int start, int end, int target) {
        if (start > end) return -1;
        int middle = start + (end - start) / 2;
        if (arr[middle] < target) return recursiveBinarySearch(arr, middle + 1, end, target);
        else if (arr[middle] > target) return recursiveBinarySearch(arr, start, middle - 1, target);
        else return middle;
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] < target) start = middle + 1;
            else if (arr[middle] > target) end = middle - 1;
            else return middle;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 13, 18};
        int target = 19;
        System.out.println("Element found at " + recursiveBinarySearch(arr, 0, 6, target));
        System.out.println("Element found at " + binarySearch(arr, target));
    }
}
