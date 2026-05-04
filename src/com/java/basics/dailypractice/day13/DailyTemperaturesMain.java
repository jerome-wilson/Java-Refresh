package com.java.basics.dailypractice.day13;

import java.util.Arrays;

public class DailyTemperaturesMain {

    public static void main(String[] args) {

        DailyTemperaturesLogic obj = new DailyTemperaturesLogic();

        int[] temperatures = {73,74,75,71,69,72,76,73};

        int[] result = obj.dailyTemperatures(temperatures);

        System.out.println("Result: " + Arrays.toString(result));
    }
}
