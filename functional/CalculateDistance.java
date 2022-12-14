package com.bridgelabz.functional;
import java.util.Scanner;

/**
 * calculate distance between two points
 */
public class CalculateDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X Point");
        final int x = scanner.nextInt();
        System.out.println("Enter Y Point");
        final int y = scanner.nextInt();
        scanner.close();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The Euclidean distance is :" + distance);
    }
}