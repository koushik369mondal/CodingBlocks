package HW;

import java.util.Scanner;

public class ass2 {
    //  * * * * *
    //  * *   * *
    //  *       *
    //  * *   * *
    //  * * * * *
    public static void pattern1(int n){
        int mid = (n + 1) / 2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n || (i == j || j == n - i + 1) && !(i == mid && j == mid)){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    //       1 
    //     2 3 2 
    //   3 4 5 4 3 
    // 4 5 6 7 6 5 4
    public static void pattern2(int n){}

    //          *
    //      *   *   *  
    //  *   *   *   *   *  
    //      *   *   *
    //          *
    public static void pattern3(int n){
        int mid = (n + 1) / 2;
        for(int i=1; i<=mid; i++){
            // space
            for(int j=1; j<=mid-i; j++){
                System.out.print("\t");
            }
            // stars
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        for(int i=mid-1; i>=1; i--){
            // space
            for (int j = 1; j <= mid - i; j++) {
                System.out.print("\t");
            }
            // stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    // 1 
    // 2 3 
    // 4 5 6 
    // 7 8 9 10
    public static void pattern4(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }
    }

    //     *****
    //    *   *
    //   *   *
    //  *   *
    // *****
    public static void pattern5(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int k=1; k<=n; k++){
                if(i==1 || i==n || k==1 || k==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    //     1 
    //   2 3 2 
    // 3 4 5 4 3 
    //   2 3 2 
    //     1
    public static void pattern6(){}

    // 1 
    // 2 2 
    // 3 0 3 
    // 4 0 0 4 
    // 5 0 0 0 5
    public static void pattern7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print(i + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }

    // 0 
    // 1 1 
    // 2 3 5 
    // 8 13 21 34
    public static void pattern8(){}

    // 1           1 
    // 1 2       2 1 
    // 1 2 3   3 2 1 
    // 1 2 3 4 3 2 1
    public static void pattern9(){}

    // *********
    // **** ****
    // ***   ***
    // **     **
    // *       *
    // **     **
    // ***   ***
    // **** ****
    // *********
    public static void pattern10(){}

    //             1 
    //         2 1   1 2 
    //     3 2 1       1 2 3 
    // 4 3 2 1           1 2 3 4 
    //     3 2 1       1 2 3 
    //         2 1   1 2 
    //             1
    public static void pattern11(){}

    // 1 
    // 1 1 
    // 1 2 1 
    // 1 3 3 1 
    // 1 4 6 4 1 
    // 1 5 10 10 5 1
    public static void pattern12(){}

    // 5                   5 
    // 5 4               4 5 
    // 5 4 3           3 4 5 
    // 5 4 3 2       2 3 4 5 
    // 5 4 3 2 1   1 2 3 4 5 
    // 5 4 3 2 1 0 1 2 3 4 5 
    // 5 4 3 2 1   1 2 3 4 5 
    // 5 4 3 2       2 3 4 5 
    // 5 4 3           3 4 5 
    // 5 4               4 5 
    // 5                   5
    public static void pattern13(){}

    // 5 4 3 2 1 0 1 2 3 4 5 
    //   4 3 2 1 0 1 2 3 4 
    //     3 2 1 0 1 2 3 
    //       2 1 0 1 2 
    //         1 0 1 
    //           0 
    //         1 0 1 
    //       2 1 0 1 2 
    //     3 2 1 0 1 2 3 
    //   4 3 2 1 0 1 2 3 4 
    // 5 4 3 2 1 0 1 2 3 4 5
    public static void pattern14(){}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // pattern1(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        pattern7(n);
        sc.close();
    }
}
