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
    public static void binaryToDecimal(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = 0; 
        int powerOfTwo = 1; // represents 2^0
        while (n > 0) {
            int digit = n % 10;
            decimal += digit * powerOfTwo;
            powerOfTwo = powerOfTwo * 2; // move to the next power of 2
            n /= 10;
        }
        System.out.println(decimal);
        sc.close();
    }

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
    public static void chewbacca(){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            int inverted = 9 - digit;
            if (i == 0 && inverted == 0) {
                result.append(digit);
            } else {
                result.append(Math.min(digit, inverted));
            }
        }
        System.out.println(result);
        sc.close();
    }

    // Replace Them All
    public static void replaceZero(){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.print(n.replace('0', '5'));
        sc.close();
    }

    // Simple Input
    public static void simpleInput(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            sum = sum + n;
            if (sum < 0) {
                break;
            }
            System.out.println(n);
        }
        sc.close();
    }

    // Print Armstrong Numbers

    // Conversion(Any To Any)

    // Boston Numbers

    // Shopping Game

    // Inverse of number

    // Odd and Even back in Delhi
    public static void oddEvenDelhi(){
        Scanner sc = new Scanner(System.in);
        int car = sc.nextInt();
        for(int i=1; i<=car; i++){
            int n = sc.nextInt();
            int sumOdd = 0;
            int sumEven = 0;
            while(n > 0){
                int lastDigit = n % 10; // get last digit
                if(lastDigit % 2 == 0){
                    sumEven = sumEven + lastDigit;
                } else {
                    sumOdd = sumOdd + lastDigit;
                }
                n = n/10; // remove last digit 
            }
            if(sumEven % 4 == 0 || sumOdd % 3 == 0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }

    // Is Armstrong Number
    public static void isArmStrong(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int original = n;
        int sum = 0;
        //Count digits
        int temp = n;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        //Calculate Armstrong sum
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;
        }

        if (sum == original) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    public static void main(String[] args) {
        // printReverse();
        // checkPrime();
        // countDigits();
        // sumOfOddEven();
        // LCM();
        // isArmStrong();
        // replaceZero();
        // simpleInput();
        // chewbacca();
        // binaryToDecimal();
        oddEvenDelhi();
    }
}
