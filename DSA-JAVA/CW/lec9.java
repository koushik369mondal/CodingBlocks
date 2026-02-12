package CW;

public class lec9 {

    public static void evenOdd1(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static int evenOdd2(int n){
        if (n % 2 == 0) {
            return 1; 
        } else {
            return 0;
        }
    }

    public static void max1(int a, int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static int max2(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        return 0;
    }

    public static void maxThree1(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static int maxThree2(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {      
        int n = 10;

        evenOdd1(n); 
        int result = evenOdd2(n);
        if (result == 1) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        int a = 5, b = 10;
        max1(a, b);
        max2(a, b);

        int c = 15;
        maxThree1(a, b, c);
        
        int max = maxThree2(a, b, c);
        System.out.println(max);
    }
}
