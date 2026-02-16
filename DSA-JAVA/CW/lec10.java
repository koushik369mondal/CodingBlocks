package CW;

import java.util.Scanner;

public class lec10 {
    public static void printArray(int n){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void findElement(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int key = 0;
        System.out.println("Enter 5 integers: ");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        key = sc.nextInt();
        for(int i=0; i<5; i++){
            if(arr[i] == key){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        // printArray(5);
        findElement();
    }
}
