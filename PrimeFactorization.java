package com.bridgelabz;
import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        number = scanner.nextInt();
/**
 * 2 is the smallest prime number so initial value of i=2
 */
        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
        scanner.close();
    }
}