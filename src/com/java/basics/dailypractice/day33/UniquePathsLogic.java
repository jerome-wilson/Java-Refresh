package com.java.basics.dailypractice.day33;

public class UniquePathsLogic {
// LeetCode #62, Difficulty: Medium

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        // First row - only one way to reach each cell
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // First column - only one way to reach each cell
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // Fill the rest
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}
