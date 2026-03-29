package ClassTest;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        // rotate();
        // inverseOfArray();
        maxSum();
        // trappingRainWater();
        // productOfArrayExceptSelf();
        // findMedian();
        // runningSum();
        // rightShift();
    }

    // rotate array by k times
    public static void rotate(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n; 
        while (k-- > 0) {
            int temp = array[0];
            for (int i=1; i<n; i++) {
                array[i-1] = array[i];
            }
            array[n - 1] = temp;
        }
        // for (int x : array) {
        // System.out.print(x + " ");
        // }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
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

    // maximum subarray sum ** eg: input: 1,2,3,-7,8,7 output: 15 (8 + 7)
    public static void maxSum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = 0;
        int currentSum = 0;
        for(int i=0; i<n; i++){
            currentSum = currentSum + arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }           
        }
        System.out.println(maxSum);
        sc.close();
    }

    // trapping rain water ***
    public static void trappingRainWater(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix[i] = Math.max(prefix[i-1], arr[i]);
        }
        suffix[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suffix[i] = Math.max(suffix[i+1], arr[i]);
        }
        int water = 0;
        for(int i=0; i<n; i++){
            water += Math.min(prefix[i], suffix[i]) - arr[i];
        }
        System.out.println(water);
        sc.close();
    }

    // product of array except self
    public static void productOfArrayExceptSelf(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = 1;
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] * arr[i-1];
        }
        suffix[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * arr[i+1];
        }
        for(int i=0; i<n; i++){
            System.out.println(prefix[i] * suffix[i]);            
        }
        sc.close();
    }

    // median of two sorted arrays
    public static void findMedian(){
        Scanner sc = new Scanner(System.in);
        // 1st arr
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        // 2nd arr
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        // merge
        int merge[] = new int[n1+n2];
        int k=0; // pointer for merge array
        for(int i=0; i<n1; i++){
            merge[k] = arr1[i];
            k++;
        }
        for(int i=0; i<n2; i++){
            merge[k] = arr2[i];
            k++;
        }
        // sort
        Arrays.sort(merge);
        // median
        int n = merge.length;
        if(n % 2 == 0){ // even
            System.out.println((merge[n/2] + merge[n/2 - 1]) / 2.0);
        } else { // odd
            System.out.println(merge[n/2]);
        }
        sc.close();
    }

    // running sum of an array
    public static void runningSum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum[] = new int[n];
        sum[0] = arr[0];
        for(int i=1; i<n; i++){
            sum[i] = sum[i-1] + arr[i];
        }
        for (int i=0; i<n; i++) {
            System.out.print(sum[i] + " ");
        }
        sc.close();
    }

    // right shift by 1
    public static void rightShift(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int last = arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
