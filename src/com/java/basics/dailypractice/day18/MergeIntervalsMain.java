package com.java.basics.dailypractice.day18;

import java.util.Arrays;

public class MergeIntervalsMain {

    public static void main(String[] args) {

        MergeIntervalsLogic obj = new MergeIntervalsLogic();

        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        int[][] result = obj.merge(intervals);

        System.out.println("Merged Intervals:");

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
