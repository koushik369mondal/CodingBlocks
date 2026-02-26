package Assignment.A3;

import java.util.Scanner;

public class ass3 {

    // Sum of odd placed and even placed digits

    // Count Digits

    // Print reverse
    public static void printReverse(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0){
            int rem = n % 10;
            System.out.print(rem + " ");
            n = n / 10;
        }
        sc.close();
    }

    // Binary To Decimal

    // Print Series

    // LCM

    // Nth Fibonacci (Hard)

    // Conversion (Fahrenheit to Celsius)

    // Check prime
    public static void checkPrime(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }

    // GCD

    // Chewbacca and Number

    // Replace Them All

    // Simple Input

    // Print Armstrong Numbers

    // Conversion(Any To Any)

    // Boston Numbers

    // Shopping Game

    // Inverse of number

    // Odd and Even back in Delhi

    // Is Armstrong Number


    public static void main(String[] args) {
        // printReverse();
        checkPrime();
    }
}
