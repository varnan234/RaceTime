package com.varnan;

import java.util.Scanner;

/**
 * Code that takes in race times and gives back your fastest, slowest, and average.
 * 
 * @author Varnan Goenka
 * date 21/02/2024
 */
public class RaceTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many times do you want to add: ");
        int num = input.nextInt();
        int[] time = new int[num];
        for (int i = 0; i < time.length; i++) {
            if (i == 0) {
                System.out.print("Time 1: ");
            } else {
                System.out.print("Next Time: ");
            }
            time[i] = input.nextInt();
        }
        int fast = findFastest(time);
        int slow = findSlowest(time);
        double findAverage = findAverage(time);
        System.out.println("Your fastest time is " + time[slow] +
                " Your slowest time is " + time[fast] + " Your average time is " + findAverage);
    }

    /**
     * Finds the index of the fastest time in the array.
     * 
     * @param times An array of race times.
     * @return The index of the fastest time.
     */
    public static int findFastest(int[] times) {
        int num = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[num]) {
                num = i;
            }
        }
        return num;
    }

    /**
     * Finds the index of the slowest time in the array.
     * 
     * @param times An array of race times.
     * @return The index of the slowest time.
     */
    public static int findSlowest(int[] times) {
        int num = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] > times[num]) {
                num = i;
            }
        }
        return num;
    }

    /**
     * Finds the average of race times.
     * 
     * @param times An array of race times.
     * @return The average of race times.
     */
    public static double findAverage(int[] times) {
        int num = 0;
        for (int i = 0; i < times.length; i++) {
            num += times[i];
        }
        double mean = (double) num / times.length;
        return mean;
    }
}
