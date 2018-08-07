/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author betzler
 * The HealthyHearts class implements an application which prints maximum heart
 * rate and min/max heart rate zone to the console, all determined from input age.
 */
public class HealthyHearts {

    /*
    public static void main(String[] args)
    Entry point for the program; execution begins here.
     */
    public static void main(String[] args) {
        int yourAge;
        int maxHeartRate;
        double targetLow;
        double targetHigh;
        int targetLowRoundedUp;
        int targetHighRoundedUp;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nWhat is your age?   ");
        yourAge = sc.nextInt();

        maxHeartRate = 220 - yourAge;
        targetLow = maxHeartRate * .5;
        targetHigh = maxHeartRate * .85;
        //Whole number heart rate zone values are more user friendly/informative.
        targetLowRoundedUp = (int) Math.ceil(targetLow);
        targetHighRoundedUp = (int) Math.ceil(targetHigh);

        System.out.println("\nYour maximum heart rate should be " + maxHeartRate + " beats per minute.");
        System.out.print("Your target HR Zone is " + targetLowRoundedUp);
        System.out.println(" - " + targetHighRoundedUp + " beats per minute.\n");
    }

}
