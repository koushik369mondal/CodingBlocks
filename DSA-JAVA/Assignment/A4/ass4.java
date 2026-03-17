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
        // maximumCircularSum();
        // runningSumOfArray();
        // vonNeumanLovesBinary();
        // pairOfRoses();
        // alexGoesShopping();
        // sortingPatientSeverityLevelsInHospitals();
        // nextPermutation();
        // helpRamu();
        // maximumSumPath();
        // cyclicArraySum();
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
    public static void pairOfRoses(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            int money = sc.nextInt();
            Arrays.sort(arr);
            int left = 0; // left pointer
            int right = n-1; // right pointer
            int rose1 = 0;
            int rose2 = 0;
            while(left < right){
                int sum = arr[left] + arr[right];
                if(sum == money){
                    rose1 = arr[left];
                    rose2 = arr[right];
                    left++;
                    right--;
                }
                else if(sum < money){
                    left++;
                }
                else {
                    right--;
                }
            }
            System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");
        }
        sc.close();
    }

    // Help Ramu
    public static void helpRamu(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] rickshaw = new int[n];
            int[] cab = new int[m];
            for (int i = 0; i < n; i++) {
                rickshaw[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                cab[i] = sc.nextInt();
            }
            // cost for rickshaws
            int rickshawCost = 0;
            for (int i = 0; i < n; i++) {
                rickshawCost += Math.min(rickshaw[i] * c1, c2);
            }
            rickshawCost = Math.min(rickshawCost, c3);
            // cost for cabs
            int cabCost = 0;
            for (int i = 0; i < m; i++) {
                cabCost += Math.min(cab[i] * c1, c2);
            }
            cabCost = Math.min(cabCost, c3);
            // final cost
            int result = Math.min(rickshawCost + cabCost, c4);
            System.out.println(result);
        }
        sc.close();
    }

    // Alex Goes Shopping
    public static void alexGoesShopping() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int test = sc.nextInt(); 
        for (int i=0; i<test; i++) {
            int price = sc.nextInt(); 
            int noOfItems = sc.nextInt(); 
            int count = 0;
            for (int j=0; j<n; j++) {
                if (price % arr[j] == 0) {
                    count++;
                }
            }
            if (count >= noOfItems) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }

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
    public static void cyclicArraySum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long sum = 0;
        long mod = 1000000007;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            sum = (sum + arr[i]) % mod;
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            sc.nextInt(); // ignore X
        }
        // compute (2^q % mod)
        long power = 1;
        long base = 2;
        while (q > 0) {
            if ((q & 1) == 1) {
                power = (power * base) % mod;
            }
            base = (base * base) % mod;
            q = q >> 1;
        }
        long result = (sum * power) % mod;
        System.out.println(result);
        sc.close();
    }

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
    public static void maximumSumPath() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            int i = 0, j = 0;
            int sum1 = 0, sum2 = 0;
            int result = 0;
            while (i < n && j < m) {
                if (arr1[i] < arr2[j]) {
                    sum1 += arr1[i];
                    i++;
                } else if (arr2[j] < arr1[i]) {
                    sum2 += arr2[j];
                    j++;
                } else {
                    // common element
                    result += Math.max(sum1, sum2) + arr1[i];
                    sum1 = 0;
                    sum2 = 0;
                    i++;
                    j++;
                }
            }
            // remaining elements
            while (i < n) {
                sum1 += arr1[i];
                i++;
            }
            while (j < m) {
                sum2 += arr2[j];
                j++;
            }
            result += Math.max(sum1, sum2);
            System.out.println(result);
        }
        sc.close();
    }

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
    public static void maximumCircularSum(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k=0; k<t; k++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxSum = Integer.MIN_VALUE;
            for (int i=0; i<n; i++) {
                int currentSum = 0;
                for (int j=0; j<n; j++) {
                    currentSum += arr[(i+j)%n];
                    maxSum = Math.max(maxSum, currentSum);
                }
            }
            System.out.println(maxSum);
        }
        sc.close();
    }

    // Sorting Patient Severity Levels in Hospitals
    public static void sortingPatientSeverityLevelsInHospitals() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

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
    public static void runningSumOfArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i=1; i<n; i++) {
            sum[i] = sum[i-1] + arr[i];
        }
        for (int i=0; i<n; i++) {
            System.out.print(sum[i] + " ");
        }
        sc.close();
    }

    // Von Neuman Loves Binary
    public static void vonNeumanLovesBinary() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            System.out.println(Integer.parseInt(sc.next(), 2));
        }
        sc.close();
    }

    // Rain Water Trapping
    public static void rainWaterTrapping() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test=0; test<t; test++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] prefix = new int[n];
            int[] suffix = new int[n];
            prefix[0] = arr[0];
            for (int i=1; i<n; i++) {
                prefix[i] = Math.max(prefix[i-1], arr[i]);
            }
            suffix[n-1] = arr[n-1];
            for (int i=n-2; i>=0; i--) {
                suffix[i] = Math.max(suffix[i+1], arr[i]);
            }
            int water=0;
            for (int i=0; i<n; i++) {
                water += Math.min(prefix[i], suffix[i]) - arr[i];
            }
            System.out.println(water);
        }
        sc.close();
    }

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
    public static void nextPermutation() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = n-2;
        while (i >= 0 && arr[i] >= arr[i+1]) {
            i--;
        }
        if (i >= 0) {
            int j = n-1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // reverse the suffix
        int left = i+1;
        int right = n-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int k=0; k<n; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}
