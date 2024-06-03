package LabSession1.Lab1.EX2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String args[]){
        System.out.println("Hello!");

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Read the first 3x3 matrix");
        int[][] matrix1 = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Read the second 3x3 matrix");
        int[][] matrix2 = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }*/

        int[][] matrix1 = {
                {2, 3, 1},
                {7, 1, 6},
                {9, 2, 4}
        };

        int[][] matrix2 = {
                {8, 5, 3},
                {3, 9, 2},
                {2, 7, 3}
        };

        System.out.println("The sum of the 2 matrices is:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrix1[i][j]+matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The multiplication of the 2 matrices is:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                int addition = 0;
                for (int k = 0; k < 3; k++){
                    addition += matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(addition + " ");
            }
            System.out.println();
        }
    }
}