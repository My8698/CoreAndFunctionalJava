package com.bridgelabz;
import java.util.Scanner;
public class HarmonicNumberSum {
    /**
     * to print sum of harmonic series
     */
    public static void main(String[] args) {
        /**
         * initially assign sum=0
         */
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of number : ");
        int number = scanner.nextInt();

        for (double i = 1; i <= number ; i++) {
            sum = sum +1/i;
        }
        System.out.println(sum);
        scanner.close();
    }
}
