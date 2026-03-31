// 31 May 2026
package CW.TwoDArrays.Day25;

import java.util.Scanner;

public class lec_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // wavePrint(arr);
        // transpose(arr);
        multiplication(arr);
        sc.close();
    }

    // wave print
    public static void wavePrint(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        for(int j=0; j<m; j++){
            if(j%2 == 0){
                for(int i=0; i<n; i++){
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for(int i=n-1; i>=0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    // transpose of a matrix 
    public static void transpose(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int transpose[][] = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    // spiral print

    // multiplication 
    public static void multiplication(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int multi[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                multi[i][j] = arr[i][j] * arr[i][j];
            }
        }
        System.out.println("Multiplication 2D Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
