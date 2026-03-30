// 30th March 2026
package CW.Day24;

import java.util.Scanner;

public class lec_24 {
    // Print 2D Array
    public static void TwoDArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Find Max 
    public static void findMax(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max: " + max);
        sc.close();
    }

    // print Even and Odd
    public static void EvenOdd(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] % 2 == 0){
                    System.out.print("Even: " + arr[i][j] + " ");
                } else {
                    System.out.print("Odd: " + arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    // Linear Search in 2D Array

    // Binary Search in 2D Array


    public static void main(String[] args) {
        // TwoDArray();
        // findMax();
        EvenOdd();
    }
    
}
