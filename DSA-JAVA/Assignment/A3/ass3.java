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
        while (n > 0) {
            int rem = n % 10;
            System.out.print(rem);
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
    public static void printSeries(){
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        sc.close();
        int count = 0;
        for (int n = 1; count < N1; n++) {
            int value = 3 * n + 2;
            if (value % N2 != 0) {
                System.out.println(value);
                count++;
            }
        }
    }

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
    public static void nthFibonacci(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println(a);
        sc.close();
    }

    // Conversion (Fahrenheit to Celsius)
    public static void fahrenheitToCelsius(){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();
        for (int f = min; f <= max; f += step) {
            int c = (5 * (f - 32)) / 9; 
            System.out.println(f + "\t" + c);
        }
        sc.close();
    }

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
    public static void printArmstrongNums(){
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        sc.close();
        for(int i=N1; i<=N2; i++){
            int num = i;
            int digits = 0;
            // Count digits
            while(num > 0){
                digits++;
                num = num / 10; 
            }
            num = i; 
            int sum = 0; 
            // Calculate Armstrong sum
            while(num > 0){
                int rem = num % 10;
                sum += Math.pow(rem, digits);
                num = num / 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }

    // Conversion(Any To Any)
    public static void anyToAny(){
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt(); 
        int sn = sc.nextInt(); 
        int decimal = 0;
        int power = 1;
        while (sn > 0) {
            int digit = sn % 10;
            decimal += digit * power;
            power *= sb;
            sn /= 10;
        }
        int result = 0;
        power = 1;
        while (decimal > 0) {
            int digit = decimal % db;
            result += digit * power;
            power *= 10;
            decimal /= db;
        }
        System.out.println(result);
        sc.close();
    }

    // Boston Numbers
    public static void bostonNumbers(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int temp = N;
        int digitSumN = 0;

        while (temp > 0) {
            digitSumN += temp % 10;
            temp /= 10;
        }

        int num = N;
        int primeFactorSum = 0;
        boolean isComposite = false;

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                isComposite = true;

                int factor = i;
                while (factor > 0) {
                    primeFactorSum += factor % 10;
                    factor /= 10;
                }

                num /= i;
            }
        }

        if (num > 1) {
            isComposite = true;
            int factor = num;
            while (factor > 0) {
                primeFactorSum += factor % 10;
                factor /= 10;
            }
        }

        if (isComposite && digitSumN == primeFactorSum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    // Shopping Game
    public static void shoppingGame(){
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
        while (game > 0) {
            int m = sc.nextInt(); // Aayush limit
            int n = sc.nextInt(); // Harshit limit
            int A = 0; // total bought by Aayush
            int H = 0; // total bought by Harshit
            int count = 1;
            while (true) {
                if (count % 2 == 1) { // Aayush turn
                    if (A + count > m) {
                        System.out.println("Harshit");
                        break;
                    }
                    A += count;
                } else { // Harshit turn
                    if (H + count > n) {
                        System.out.println("Aayush");
                        break;
                    }
                    H += count;
                }
                count++;
            }
            game--;
        }
        sc.close();
    }

    // Inverse of number
    public static void inverseOfNumber(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inverse = 0;
        int position = 1;
        while (n > 0) {
            int digit = n % 10;
            inverse += position * (int) Math.pow(10, digit - 1);
            n /= 10;
            position++;
        }
        System.out.println(inverse);
        sc.close();
    }

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
        // GCD();
        // countDigits();
        // sumOfOddEven();
        // LCM();
        // isArmStrong();
        // replaceZero();
        // simpleInput();
        // chewbacca();
        // binaryToDecimal();
        // oddEvenDelhi();
        // printArmstrongNums();
        // printSeries();
        // nthFibonacci();
        // fahrenheitToCelsius();
        // anyToAny();
        // bostonNumbers();
        // shoppingGame();
        inverseOfNumber();
    }
}
