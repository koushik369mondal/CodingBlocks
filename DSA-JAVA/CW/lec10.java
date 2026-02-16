package CW;

import java.util.Scanner;

public class lec10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        System.out.println("Enter 5 integers: ");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
