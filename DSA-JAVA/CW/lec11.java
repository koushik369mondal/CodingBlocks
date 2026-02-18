package CW;

import java.util.Scanner;

public class lec11 {
    public static int arrayMax(int arr[]) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max: " + arrayMax(arr));
        System.out.println("Min: " + arrayMin(arr));

        int a = sc.nextInt();
        int b = sc.nextInt();
        swaptemp(a, b);
        swapwithouttemp(a, b);
        swapXOR(a, b);

        sc.close();
    }
}
