package org.lecture;

public class        ArrayExercise {
    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9,}
        };

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        //Summe aus der diagonale Berechnen links nach rechts
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i]; //1 1; 2 2; 3 3;
        }
        System.out.println("Diagonale Summe links-rechts:" + sum);

        //Summe aus der diagonale Berechnen rechts nach links
        sum = 0;
        for (int row = 0; row < arr.length; row++) {
            sum += arr[row][arr.length - 1 - row];//0 2; 1 1; 2 0;
            /*
            [0][2]value: 3
            [1][1]value: 5
            [2][0]value: 7
             */
        }
        System.out.println("Diagonale Summe rechts-links:" + sum);

        /**
         * {1, 2, 3},
         * {4, 5, 6},
         * {7, 8, 9,}
         * nur die Summer der diagonalen also 1, 3, 5, 7, 9
         */
        int xSum = 0;
        for (int i = 0; i < arr.length; i++) {
            xSum += arr[i][i]; //1 1; 2 2; 3 3;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1 - i) {
                xSum += arr[i][arr.length - 1 - i];
            }
        }
        System.out.println("Summe vom X: " + xSum);


    }
}
/**
 * Problem Statement:
 * You are given a square matrix mat of size n x n. Your task is to calculate the sum of two diagonals of the matrix:
 *
 * Primary Diagonal: Includes elements where the row index equals the column index (mat[i][i]).
 *
 * Secondary Diagonal: Includes elements where the row index + column index equals n - 1,
 * but excludes elements that are also part of the primary diagonal.
 *
 * Example:
 * For a matrix mat:
 *
 * 1  2  3
 * 4  5  6
 * 7  8  9
 * Primary Diagonal elements: 1, 5, 9
 *
 * Secondary Diagonal elements (excluding primary): 3, 5, 7
 *
 * The sum of the primary and secondary diagonals in this example would be 1 + 5 + 9 + 3 + 7 = 25.
 *
 * Approach:
 * Input Reading: Read the size of the matrix (n) and its elements from the user.
 *
 * Sum Calculation:
 *
 * Calculate the sum of the primary diagonal (mat[i][i] for all i).
 *
 * Calculate the sum of the secondary diagonal (mat[i][n-1-i] for all i except when i equals n-1-i to avoid counting the middle element twice).
 *
 * Output: Print the sum of both diagonals.
 */
