package com.bridgelabz;
import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value first number:");
        int firstNumber=scanner.nextInt();

        System.out.println("Enter the value Second number:");
        int secondNumber=scanner.nextInt();

        System.out.println("Enter the value Third number:");
        int thirdNumber=scanner.nextInt();

        if(firstNumber>=secondNumber&firstNumber>=thirdNumber) {
            System.out.println(firstNumber + " is Largest");
        }
        else if(secondNumber>=thirdNumber) {
            System.out.println(secondNumber +" is Largest");
        }
        else {
            System.out.println(thirdNumber +" is Largest");
        }
        scanner.close();
    }
}