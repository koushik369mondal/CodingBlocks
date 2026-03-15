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
        // sortZeroesAndOnes();
        // bubbleSort();
        // selectionSort();
        // insertionSort();
        // productOfArrayExceptSelf();
        // majorityElement();
        // rainWaterTrapping();
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
    public static void bubbleSort(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }

    // Maximum Sum Path in Two Arrays

    // Arrays-Selection Sort
    public static void selectionSort(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n-1; i++) {
            int minIndex = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }

    // Arrays-Insertion Sort
    public static void insertionSort(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=1; i<n; i++) {
            int j = i;
            while (j>0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    // Maximum Circular Sum

    // Sorting Patient Severity Levels in Hospitals

    // Product of Array Except Self
    public static void productOfArrayExceptSelf(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        // prefix
        prefix[0] = 1;
        for (int i=1; i<n; i++) {
            prefix[i] = prefix[i-1] * arr[i-1];
        }
        // suffix
        suffix[n-1] = 1;
        for (int i=n-2; i>=0; i--) {
            suffix[i] = suffix[i + 1] * arr[i+1];
        }
        for (int i=0; i<n; i++) {
            System.out.print(prefix[i] * suffix[i] + " ");
        }
        sc.close();
    }

    // Running Sum of the Array

    // Von Neuman Loves Binary

    // Rain Water Trapping

    // Majority Element
    public static void majorityElement(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for (int i=0; i<n; i++) {
            int count = 0;
            for (int j=0; j<n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n/2) {
                result = arr[i];
                break;
            }
        }
        System.out.print(result);
        sc.close();
    }

    // Next Permutation
}
