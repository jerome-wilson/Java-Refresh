package com.java.basics.hackathon;

import java.util.*;

// Last Day Where You Can Still Cross
public class Ldwycsc {

    static int[][] dirs = {
            {1, 0},   // down
            {-1, 0},  // up
            {0, 1},   // right
            {0, -1}   // left
    };

    public static int findLastTraversableDay(int rows, int cols, int[][] floodSequence) {

        int left = 1;
        int right = floodSequence.length;
        int ans = 0;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (canCross(rows, cols, floodSequence, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    static boolean canCross(int rows, int cols, int[][] floodSequence, int day) {

        int[][] grid = new int[rows][cols];

        // mark flooded cells
        for (int i = 0; i < day; i++) {
            int r = floodSequence[i][0] - 1;
            int c = floodSequence[i][1] - 1;
            grid[r][c] = 1;
        }

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        // start BFS from top row
        for (int c = 0; c < cols; c++) {
            if (grid[0][c] == 0) {
                q.offer(new int[]{0, c});
                visited[0][c] = true;
            }
        }

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            if (r == rows - 1) {
                return true;
            }

            for (int[] d : dirs) {

                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nc >= 0 && nr < rows && nc < cols &&
                        !visited[nr][nc] && grid[nr][nc] == 0) {

                    visited[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return false;
    }

    // simple test
    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        int[][] floodSequence = {
                {1,2},
                {2,1},
                {3,3},
                {2,2},
                {1,1},
                {1,3},
                {2,3},
                {3,2},
                {3,1}
        };

        int result = findLastTraversableDay(rows, cols, floodSequence);

        System.out.println("Last day you can cross: " + result);
    }
}
