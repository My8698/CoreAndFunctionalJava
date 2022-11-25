package com.bridgelabz.functional;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args)  {
        int row, column;
        int array[][];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of row : ");
        row = scanner.nextInt();
        System.out.print("Enter the total number of column : ");
        column = scanner.nextInt();
        array = new int[row][column];
        /**
         * for loop to take values of row and column
         */
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element for row = " + (i + 1) + " column = " + (j + 1) + " : ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("You have entered the following array : ");
        /**
         * for loop to print row and column
         */

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");			}
            System.out.println();
        }
        scanner.close();
    }
}
