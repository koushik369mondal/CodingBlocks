package ClassTest;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        // rotate();
        inverseOfArray();
    }

    // rotate array by k times
    public static void rotate(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        k = k % n; // eg: if k=5 and n=3, then we only need to rotate by 2 times (5 % 3 = 2)
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        // Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Reverse the remaining elements
        reverse(arr, k, n - 1);
        // Print the rotated array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // inverse of an array
    public static void inverseOfArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int inverse[] = new int[n];
        for(int i=0; i<n; i++){
            inverse[arr[i]] = i;
        }
        for(int i=0; i<n; i++){
            System.out.print(inverse[i] + " ");
        }
        sc.close();
    }

    // maximum subarray sum **

    // trapping rain water ***

    // product of array except self

    // median of two sorted arrays

    // running sum of an array

    // right shift by 1

}
