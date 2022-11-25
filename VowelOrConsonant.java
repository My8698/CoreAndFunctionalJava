package com.bridgelabz;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        char vowel[]= {'a','e','i','o','u','A','E','I','O','U'};
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a Character:  ");
        char character = sc.next().charAt(0);
        System.out.println("You have entered "+ character);
        for(int i=0;i<10;i++)
        {
            if( character==vowel[i]) {
                System.out.println("Its a Vowel");
                System.exit(0);
            }
        }
        System.out.println("Its a Consonant");
        sc.close();
    }
}