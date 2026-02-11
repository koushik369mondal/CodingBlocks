package CW;
import java.util.Scanner;

public class lec8 {

    public static void isPrime(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<n; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }


    public static void printPrimeNumbers(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }


    public static void fibonacci(){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        for(int i=3; i<=n; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }


    public static void hcf(){
        int a = 60;
        int b = 36;

        while(a%b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        System.out.println("HCF is: " + b);
    }


    public static void gcd(){}


    public static void main(String[] args) {
        // isPrime();
        // printPrimeNumbers();
        // fibonacci();
        hcf();
    }
}
