package com.bridgelabz;
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        int number_1, number_2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        number_1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        number_2 = scanner.nextInt();

        int remainder = number_1 % number_2 ;
        System.out.println("Remainder is : " +remainder);

        int quotient = number_1/number_2;
        System.out.println("Quotient is : " +quotient);
        scanner.close();
    }
}