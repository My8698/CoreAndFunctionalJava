package com.bridgelabz;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_1,number_2,temp;
        System.out.println("Enter first number");
        number_1=sc.nextInt();

        System.out.println("Enter second number");
        number_2=sc.nextInt();

        System.out.println("You have entered : " +number_1 +" and " +number_2);
        /**
         * logic to swap two numbers using temporary variable
         */

        temp=number_1;
        number_1=number_2;
        number_2=temp;

        System.out.println("After swapping : " +number_1+ " and " + number_2);
        sc.close();
    }
}