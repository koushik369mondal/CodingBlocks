package Assignment.A4;

import java.util.Arrays;
import java.util.Scanner;

public class ass4 {
    public static void main(String[] args) {
        // inverseOfArray();
        // linearSearch();
        // reverseArray();
        // squaresOfSortedArray();
        // maxValueInArray();
        // targetSumPairs();
        // targetSumTriplets();
        sortZeroesAndOnes();
    }

    // Inverse of an array
    public static void inverseOfArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] inverse = new int[n];
        for(int i=0; i<n; i++){
            inverse[arr[i]] = i;
        }
        for(int i=0; i<n; i++){
            System.out.print(inverse[i] + " ");
        }
        sc.close();
    }

    // Arrays-Target Sum Triplets
    public static void targetSumTriplets(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr); 
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int k=j+1; k<n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    }
                }
            }
        }
        sc.close();
    }

    // Arrays-Linear Search
    public static void linearSearch(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    // Arrays - Target Sum Pairs
    public static void targetSumPairs() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr); 
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
        sc.close();
    }

    // Arrays-Max Value In Array
    public static void maxValueInArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i=1; i<n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(max);
        sc.close();
    }

    // Pair of Roses

    // Help Ramu

    // Alex Goes Shopping

    // Arrays-Reverse an Array
    public static void reverseArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=n-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

    // Squares of a Sorted Array
    public static void squaresOfSortedArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] squares = new int[n];
        for (int i=0; i<n; i++) {
            squares[i] = arr[i] * arr[i];
        }
        Arrays.sort(squares);
        for (int i=0; i<n; i++) {
            System.out.print(squares[i] + " ");
        }
        sc.close();
    }

    // Sort just Zeroes and Ones
    public static void sortZeroesAndOnes(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int countZeroes = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] == 0) {
                countZeroes++;
            }
        }
        for (int i=0; i<countZeroes; i++) {
            System.out.print(0 + " ");
        }
        for (int i=countZeroes; i<n; i++) {
            System.out.print(1 + " ");
        }
        sc.close();
    }

    // Calculate The Sum

    // Arrays-Bubble Sort

    // Maximum Sum Path in Two Arrays

    // Arrays-Selection Sort

    // Arrays-Insertion Sort

    // Maximum Circular Sum

    // Sorting Patient Severity Levels in Hospitals

    // Product of Array Except Self

    // Running Sum of the Array

    // Von Neuman Loves Binary

    // Rain Water Trapping

    // Majority Element

    // Next Permutation
}
