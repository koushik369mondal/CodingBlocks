package Assignment.A3;

import java.util.Scanner;

public class ass3 {

    // Sum of odd placed and even placed digits
    public static void sumOfOddEven(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int oddSum = 0;
        int evenSum = 0;
        int position = 1;
        while(n > 0){
            int rem = n % 10;
            if(position % 2 == 0){
                evenSum = evenSum + rem;
            } else {
                oddSum = oddSum + rem;
            }
            n = n / 10;
            position++;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }

    // Count Digits
    public static void countDigits(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();
        sc.close();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == digit){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }

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
    public static void LCM(){
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        sc.close();
        int max = Math.max(N1, N2);
        while(true){
            if(max % N1 == 0 && max % N2 == 0){
                System.out.println(max);
                break;
            }
            max++;
        }
    }

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
    public static void GCD(){
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        sc.close();
        while(N1 != N2){
            if(N1 > N2){
                N1 = N1 - N2;
            } else {
                N2 = N2 - N1;
            }
        }
        System.out.println(N1);
    }

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
        // checkPrime();
        // countDigits();
        // sumOfOddEven();
        LCM();
    }
}
