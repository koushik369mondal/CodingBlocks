package ClassTest;

import java.util.Scanner;

public class test1{
    public static void main(String[] args) {
        // productOfArrayExceptSelf();
        maxSubArraySum();
    }

    // product of array accept itself
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
            System.out.print(prefix[i] * suffix[i] + " ");
        }
        sc.close();
    }

    // maximum subarray sum
    public static void maxSubArraySum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
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

}