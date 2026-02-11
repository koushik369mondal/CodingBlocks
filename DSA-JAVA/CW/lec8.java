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

    public static void main(String[] args) {
        // isPrime();
        printPrimeNumbers();
    }
}
