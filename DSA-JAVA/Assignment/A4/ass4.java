package Assignment.A4;

import java.util.Scanner;

public class ass4 {
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

    // Arrays-Linear Search
    public static void linearSearch(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of the array
        int target = sc.nextInt(); // Target element
        int arr[] = new int[n]; // Array declaration
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int index = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        System.out.println(index);
        sc.close();
    }

    // Arrays-Target Sum Pairs

    // Arrays-Max Value In Array

    // Pair of Roses

    // Help Ramu

    // Alex Goes Shopping

    // Arrays-Reverse an Array

    // Squares of a Sorted Array

    // Sort just Zeroes and Ones

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

    public static void main(String[] args) {
        // inverseOfArray();

        linearSearch();
    }
}
