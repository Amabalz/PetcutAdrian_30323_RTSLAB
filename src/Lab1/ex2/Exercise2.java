package Lab1.ex2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int i, j, n = 3;
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int [n][n];
        int[][] ans = new int [n][n];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st matrix elements and then 2nd matrix elements");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                arr1[i][j] = scan.nextInt();
            }
        }
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                arr2[i][j] = scan.nextInt();
            }
        }
        System.out.println("The addition of the two matrices is: \n");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("The multiplication of the two matrices is: \n");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                ans[i][j] = 0;
                for(int k = 0; k < n; k++){
                    ans[i][j] += arr1[i][k]*arr2[k][j];
                }
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
