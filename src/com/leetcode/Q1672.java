package com.leetcode;

public class Q1672 {
    public static void main(String[] args) {
        SolutionQ1672 solution = new SolutionQ1672();
        int ans = solution.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}});
        System.out.println(ans);

    }
}

class SolutionQ1672 {
    public int maximumWealth(int[][] accounts) {
        int maxBalance = 0;
        for (int[] ints : accounts) {
            int accountBalance = 0;
            for (int anInt : ints) accountBalance += anInt;
            if (accountBalance > maxBalance) maxBalance = accountBalance;
        }
        return maxBalance;
    }
}
