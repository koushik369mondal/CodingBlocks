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

        // binarySearch(arr);
        // wavePrint(arr);
        // transpose(arr);
        // multiplication(arr);
        spiralMatrix(arr);
        sc.close();
    }

    // Binary Search in 2D Array
    public static void binarySearch(int arr[][]) {
        int target = 4;
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int i = mid / m;
            int j = mid % m;
            if (arr[i][j] == target) {
                System.out.println("Found at: (" + i + "," + j + ")");
                return;
            } else if (arr[i][j] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Not found");
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

    // spiral matrix
    public static void spiralMatrix(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        System.out.println("Spiral Matrix: ");
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            // bottom
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(arr[endRow][j] + " ");
                }
            }
            // left
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

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
