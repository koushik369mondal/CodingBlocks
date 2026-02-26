package Test;
// import java.util.Scanner;

public class test2 {
    public static int reverse(int n){
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void fact(int n){
    
    }

    public static void gcd(int a, int b){
            while(a != b){
                if(a > b){
                    a = a-b;
                } else {
                    b = b-a;
                }
            }
        System.out.println(a);
    }

    public static void allPrime(int n){
        for(int i=1; i<=n; i++){
            
        }
    }

    //         * 
    //       *   *
    //     *   *   *
    //   *   *   *   *
    // *   *   *   *   *
    public static void pattern1(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            //stars
            for(int j=1;j<=2*i-1; j++){
                if(j%2 == 1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    // * * * * * * * * * 
    // * * * *   * * * *
    // * * *       * * *  
    // * *           * *
    // *               * 
    public static void pattern2(int n){
        for(int i=1; i<=n; i++){
            //stars
            for(int j=5; j>=i; j--){
                System.out.print("* ");
            }
            //spaces
            for(int k=1; k<=(i-1)*2; k++){
                System.out.print("  ");
            }
            // stars
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //         1
    //       1 2 3
    //     1 2 3 4 5
    //   1 2 3 4 5 6 7
    // 1 2 3 4 5 6 7 8 9
    public static void pattern3(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //numbers
            for(int k=1; k<=2*i-1; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    // * * * * * 
    //     * * * *
    //         * * *  
    //             * *
    //                 *
    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            // spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            //stars
            for(int k=1; k<=n-i+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(reverse(n));

        gcd(16, 24);
        
        // pattern1(n);

        // pattern2(5);

        // pattern3(5);

        // pattern4(5);
    }
}
