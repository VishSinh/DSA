package com.leetcode;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
class SolutionQ1295 {
    public Boolean even(int num){
        int numOfDigits = 0;
        while(num>0){
            num = num/10;
            numOfDigits++;
        }

        return numOfDigits % 2 == 0;
    }

    public Boolean even2(int num){
        int numOfDigits = 0;
        numOfDigits = (int)(Math.log10(num)) + 1;
        return numOfDigits % 2 == 0;
    }


    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(even2(num)) count++;
        }
        return count;
    }
}

public class Q1295{
    public static void main(String[] args) {
        SolutionQ1295 solution = new SolutionQ1295();
        int ans = solution.findNumbers(new int []{12,345,2,6,7896});
        System.out.println(ans);
    }
}
