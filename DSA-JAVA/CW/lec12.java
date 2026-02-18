package CW;

import java.util.Scanner;

public class lec12 {
    public static void arrayMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        // return max;
    }

    public static int arrayMin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        return min;
    }

    public static void swaptemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);
    }

    public static void swapwithouttemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + " b: " + b);
    }

    public static void swapXOR(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + " b: " + b);
    }

    public static void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void leftShift(int arr[]) {
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void rightShift(int arr[]) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.print("Max: ");
        // arrayMax(arr);
        // System.out.println("Min: " + arrayMin(arr));

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // swaptemp(a, b);
        // swapwithouttemp(a, b);
        // swapXOR(a, b);

        // reverseArray(arr);

        leftShift(arr);
        System.out.println();
        rightShift(arr);

        sc.close();
    }
}
