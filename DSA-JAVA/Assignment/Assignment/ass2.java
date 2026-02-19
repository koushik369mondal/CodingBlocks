package Assignment;
import java.util.Scanner;
public class ass2 {
    //  * * * * *
    //  * *   * *
    //  *       *
    //  * *   * *
    //  * * * * *
    public static void pattern1(int n){
        int mid = (n + 1) / 2;
        int star = mid;
        int space = 0;
        for(int i=1; i<=n; i++){
            // left stars
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }           
            // middle spaces
            if(i != 1 && i != n){
                for(int j=1; j<=space*2-1; j++){
                    System.out.print("  ");
                }
            } 
            // right stars
            if(i == 1 || i == n){
                for(int j=1; j<=star-1; j++){
                    System.out.print("* ");
                }
            } else {
                for(int j=1; j<=star; j++){
                    System.out.print("* ");
                }
            }
            // update
            if(i < mid){
                star--;
                space++;
            } else {
                star++;
                space--;
            }
            System.out.println();
        }
    }

    //              1 
    //          2   3   2 
    //      3   4   5   4   3 
    //  4   5   6   7   6   5   4
    public static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("    ");
            }
            // increasing 
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "   ");
                num++;
            }
            // decreasing
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + "   ");
                num--;
            }
            System.out.println();
        }
    }

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
    public static void pattern6(int n){
        // Upper half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            // increasing 
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            // decreasing 
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            // increasing 
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            // decreasing 
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }

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
    public static void pattern8(int n){
        int a = 0, b = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }

    // 1           1 
    // 1 2       2 1 
    // 1 2 3   3 2 1 
    // 1 2 3 4 3 2 1
    public static void pattern9(int n) {
        int space = n;
        for (int row = 1; row <= n; row++) {
            // left side
            for (int i = 1; i <= row; i++) {
                System.out.print(i + " ");
            }
            // middle space
            for (int s = 1; s <= space * 2 - 3; s++) {
                System.out.print("  ");
            }
            // right side
            if (row == n) {
                for (int i = row - 1; i >= 1; i--) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = row; i >= 1; i--) {
                    System.out.print(i + " ");
                }
            }
            space--;
            System.out.println();
        }
    }

    // *********
    // **** ****
    // ***   ***
    // **     **
    // *       *
    // **     **
    // ***   ***
    // **** ****
    // *********
    public static void pattern10(int n){
        // upper half
        for(int i=1; i<=n; i++){
            // left stars
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            // middle spaces
            if(i > 1){
                for(int j=1; j<=2*i-3; j++){
                    System.out.print(" ");
                }
            }
            // right stars
            if(i == 1){
                for(int j=1; j<=n-1; j++){
                    System.out.print("*");
                }
            } else {
                for(int j=1; j<=n-i+1; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
        // lower half
        for(int i=n-1; i>=1; i--){
            // left stars
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            // middle spaces
            if(i > 1){
                for(int j=1; j<=2*i-3; j++){
                    System.out.print(" ");
                }
            }
            // right stars
            if(i == 1){
                for(int j=1; j<=n-1; j++){
                    System.out.print("*");
                }
            } else {
                for(int j=1; j<=n-i+1; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    //             1 
    //         2 1   1 2 
    //     3 2 1       1 2 3 
    // 4 3 2 1           1 2 3 4 
    //     3 2 1       1 2 3 
    //         2 1   1 2 
    //             1
    public static void pattern11(int n){
        int mid = n / 2 + 1;
        int count = 1;
        int Lspace = (mid - 1) * 2;
        int Mspace = 0;
        for (int row = 1; row <= n; row++) {
            // left spaces
            for (int LS = 1; LS <= Lspace; LS++) {
                System.out.print("  ");
            }
            // left numbers
            for (int i = count; i >= 1; i--) {
                System.out.print(i + " ");
            }
            // middle spaces + right numbers
            if (row != 1 && row != n) {
                for (int s = 1; s <= Mspace * 2 - 1; s++) {
                    System.out.print("  ");
                }
                for (int i = 1; i <= count; i++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            if (row < mid) {
                Lspace -= 2;
                count++;
                Mspace++;
            } else {
                Lspace += 2;
                count--;
                Mspace--;
            }
        }
    }

    // 1 
    // 1 1 
    // 1 2 1 
    // 1 3 3 1 
    // 1 4 6 4 1 
    // 1 5 10 10 5 1
    public static void pattern12(int n){
        for(int i=1; i<=n; i++){
            int num = 1;
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num = num * (i - j) / j;
            }
            System.out.println();
        }
    }

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
    public static void pattern13(int n){
        // upper half
        for(int i=1; i<=n; i++){
            // descending numbers
            for(int j=n; j>=n-i+1; j--){
                System.out.print(j + " ");
            }
            // middle spaces
            for(int j=1; j<=(2*(n-i)+1)*2; j++){
                System.out.print(" ");
            }
            // ascending numbers
            for(int j=n-i+1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // middle row
        for(int j=n; j>=0; j--){
            System.out.print(j + " ");
        }
        for(int j=1; j<=n; j++){
            System.out.print(j + " ");
        }
        System.out.println();
        
        // lower half
        for(int i=n; i>=1; i--){
            // descending numbers
            for(int j=n; j>=n-i+1; j--){
                System.out.print(j + " ");
            }
            // middle spaces
            for(int j=1; j<=(2*(n-i)+1)*2; j++){
                System.out.print(" ");
            }
            // ascending numbers
            for(int j=n-i+1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

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
    public static void pattern14(int n){
        //uper half
        for(int i=n; i>=0; i--){
            //space
            for(int j=1; j<=(n-i)*2; j++){
                System.out.print(" ");
            }
            //descending 
            for(int k=i; k>=0; k--){
                System.out.print(k + " ");
            }
            //ascendiing
            for(int k=1; k<=i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        //lower half
        for(int i=1; i<=n; i++){
            // space
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            // descending
            for (int k = i; k >= 0; k--) {
                System.out.print(k + " ");
            }
            // ascendiing
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern10(n);
        pattern11(n);
        // pattern12(n);
        // pattern13(n);
        // pattern14(n);
        sc.close();
    }
}
