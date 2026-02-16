package HW;

import java.util.Scanner;

public class patterns {
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    public static void pattern1(int n){
        System.out.println("Using For Loop : ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("Using While Loop : ");
        int row = 1;
        while(row <= n){
            //star
            int i = 1;
            while(i<=n){
                System.out.print(" * ");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void pattern2(int n){
        System.out.println("Usinng For Loop : ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("Using While Loop : ");
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i <= row){
                System.out.print(" * ");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern3(int n){
        System.out.println("Using For Loop : ");
        for(int i=n; i>=1; i--){ 
            for(int j=1; j<=i; j++){ 
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("Using While Loop : ");
        int row = n;
        while(row >= 1){
            int i = 1;
            while(i <= row){
                System.out.print(" * ");
                i++;
            }
            System.out.println();
            row--;
        }
    }

    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    public static void pattern4(int n){
        System.out.println("Using For Loop : ");
        for(int row=1; row<=n; row++){
            //space
            for(int space=1; space<= n - row; space++){
                System.out.print("   ");
            }
            //stars
            for(int star=1; star<=row; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("Using While Loop : ");
        int row = 1;
        while(row <= n){
            //space
            int space = 1;
            while(space <= n-row){
                System.out.print("   ");
                space++;
            }
            //star
            int star = 1;
            while(star<=row){
                System.out.print(" * ");
                star++;
            }
            System.out.println();
            row++;
        }
    }

    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *
    public static void pattern5(int n){
        System.out.println("Using For Loop : ");
        for(int i=1; i<=n; i++){
            //space
            for(int space=1; space<i; space++){
                System.out.print("   ");
            }
            //star
            for(int star=1; star<=n-i+1; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("Using While Loop : ");
        int i = 1;
        while(i<=n){
            //space
            int space = 0;
            while(space<i){
                System.out.print("   ");
                space++;
            }
            //star
            int star = 1;
            while (star <= n-i+1) {
                System.out.print(" * ");
                star++;
            }
            System.out.println();
            i++;
        }
    }

    // * * * * *
    //     * * * *
    //         * * *
    //             * *
    //                 *
    public static void pattern6(int n){
        System.out.println("Using For Loop : ");
        for(int i=1; i<=n; i++){
            //space
            for(int space=1; space<i; space++){
                System.out.print("   ");
            }
            //space
            for(int space=1; space<i; space++){
                System.out.print("   ");
            }
            //star
            for(int star=1; star<=n-i+1; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("Using While Loop : ");
    }

    // * * * * *
    // *       *
    // *       *
    // * * * * *
    public static void pattern7(int n){
        for(int i=1; i<n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==(n-1) || j==1 || j==n){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

//  *               *
//      *       *
//          *
//      *       *
//  *               *
public static void pattern8(int n) {
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n ; j++){
            if(i==j || i+j==6){
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}

    //         *
    //       * * *
    //     * * * * *
    //   * * * * * * *
    // * * * * * * * * *
    public static void pattern9(int n){
        System.out.println("Using For Loop : ");
        for (int i=1; i<=n; i++){
            //space
            for(int space=1; space<=n-i; space++){
                System.out.print("   ");
            }
            //star
            for(int star = 1; star<=2*i-1; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("Using While Loop : ");
        int space = n - 1;
        int star = 1;
        int row = 1;
        while(row <= n){
            //space
            int i = 1;
            while(i <= space){
                System.out.print("   ");
                i++;
            }
            //star
            int j = 1;
            while(j <= star){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }
    }

    // * * * * * * * * *
    //   * * * * * * *
    //     * * * * *
    //       * * *
    //         *
    public static void pattern10(int n){
        System.out.println("Using For Loop : ");
        for(int i=1; i<=n; i++){
            //space
            for(int space=1; space<i; space++){
                System.out.print("   ");
            }
            //star
            for(int star=1; star<=2*(n-i)+1; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("Using While Loop : ");
        int space = 0;
        int star = 2 * n - 1;
        int row = 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("   ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            row++;
            space++;
            star -= 2;
        }
    }

    //         *
    //       *   *
    //     *   *   *
    //   *   *   *   *
    // *   *   *   *   *
    public static void pattern11(int n){
        System.out.println("Using For Loop : ");        
        System.out.println("Using While Loop : ");
        int space = n - 1;
        int star = 1;
        int row = 1;
        while(row <= n){
            //space
            int i = 1;
            while(i <= space){
                System.out.print("   ");
                i++;
            }
            //star
            int j = 1;
            while(j <= star){
                if(j % 2 == 1){
                    System.out.print(" * ");
                    j++;
                } else {
                    System.out.print("   ");
                    j++;
                }
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }
    }

    //         *
    //       * ! *
    //     * ! * ! *
    //   * ! * ! * ! *
    // * ! * ! * ! * ! *
    public static void pattern12(int n){
        System.out.println("Using For Loop : ");
        System.out.println("Using While Loop : ");
        int space = n - 1;
        int star = 1;
        int row = 1;
        while(row <= n){
            //space
            int i = 1;
            while(i <= space){
                System.out.print("   ");
                i++;
            }
            //star
            int j = 1;
            while(j <= star){
                if(j % 2 == 1){
                    System.out.print(" * ");
                } else {
                    System.out.print(" ! ");
                }
                j++;
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }
    }

    // *                 *
    // * *             * *
    // * * *         * * *
    // * * * *     * * * *
    // * * * * * * * * * *
    public static void pattern13(int n){
        System.out.println("Using For Loop : ");
        for(int i=1; i<=n; i++){
            //star
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            //space
            for(int space=1; space<=(n-i)*2; space++){
                System.out.print("   ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // *               *
    // * *           * *
    // * * *       * * *
    // * * * *   * * * *
    // * * * * * * * * * 
    public static void pattern14(int n){
        for(int i=1; i<=n; i++){
            //star
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            //space
            for(int k=1; k<=(n-i)*2-1; k++){
                System.out.print("   ");
            }
            //star
            if(i==n){
                for(int o = 1; o<=n-1; o++){
                    System.out.print(" * ");
                }
            } else {
                for(int j=1; j<=i; j++){
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    // * * * * * * * * *
    // * * * *   * * * *
    // * * *       * * *
    // * *           * *
    // *               *
    public static void pattern15(int n){
        for(int i=1; i<=n; i++){
            
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern16(int n){
        System.out.println("Using For Loop : ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *
    public static void pattern17(int n ){
        System.out.println("Using For Loop : ");
            for(int i=1; i<=n; i++){
                //space
                for(int space=1; space<=n-i; space++){
                    System.out.print("   ");
                }
                //star
                for(int star=1; star<=i; star++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for(int i=n-1; i>=1; i--){
                // space
                for (int space = 1; space <= n - i; space++) {
                    System.out.print("   ");
                }
                // star
                for (int star = 1; star <= i; star++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
    }

    //         * * * * *
    //       * * * *
    //     * * *
    //   * *
    // *
    //   * *
    //     * * *
    //       * * *
    //         * * * * *
    public static void pattern18(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            //star
            for(int k=1; k<=n-i+1; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            //space
            for(int j=1; j<=i-1; j++){
                System.out.print("   ");
            }
            //star
            for(int k=1; k<=i; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // * * * * *
    //     * * * *
    //         * * *
    //             * *
    //                 *
    //             * *
    //         * * *
    //     * * * *
    // * * * * *
    public static void pattern19(int n){
        System.out.println("Using For Loop : ");
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            // space
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            // space
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            // space
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }

    // * * * *   * * * *
    // * * *       * * *
    // * *           * *
    // *               *
    public static void pattern20(int n){
        System.out.println("Using For Loop : ");
        for(int i=1; i<=n; i++){
            //star
            for(int j=n; j>=i; j--){
                System.out.print(" * ");
            }
            //space
            for(int k=1; k<=(i-1)*2; k++){
                System.out.print("   ");
            }
            // star
            for (int j = n; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // * * * *   * * * *
    // * * *       * * *
    // * *           * *
    // *               *
    //
    // *               *
    // * *           * *
    // * * *       * * *
    // * * * *   * * * *
    public static void pattern21(int n){
        for(int i=1; i<=n; i++){
            //star
            for(int j=n; j>=i; j--){
                System.out.print(" * ");
            }
            //space
            for(int k=1; k<=(i-1)*2; k++){
                System.out.print("   ");
            }
            // star
            for (int j = n; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            //star
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            //space
            for(int k=1; k<=(n-i)*2; k++){
                System.out.print("   ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // * * * * * * *
    // * * *   * * *
    // * *       * *
    // *           *
    // * *       * *
    // * * *   * * *
    // * * * * * * *
    public static void pattern22(int n){}

    //       *
    //     * * *
    //   * * * * *
    // * * * * * * *
    //   * * * * *
    //     * * *
    //       *
    public static void pattern23(int n){
        System.out.println("Using For Loop : ");
        for(int i=1; i<=n; i++){
            // space
            for(int space=1; space<=n-i; space++){
                System.out.print("   ");
            }
            // stars
            for(int star=1; star<=2*i-1; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            // space
            for (int space = 1; space <= n - i; space++) {
                System.out.print("   ");
            }
            // stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //              *
    //          *       *
    //      *               *
    //  *                       *
    //      *               *
    //          *       *
    //              *
    public static void pattern24(int n){
        System.out.println("Using For Loop : ");
        for(int i=1; i<=n; i++){
            // space
            for(int space=1; space<=n-i; space++){
                System.out.print("   ");
            }
            // stars
            for(int stars = 1; stars<=2*i-1; stars++){
                if(stars == 1 || stars == 2*i-1){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            // space
            for (int space = 1; space <= n - i; space++) {
                System.out.print("   ");
            }
            // stars
            for (int stars = 1; stars <= 2 * i - 1; stars++) {
                if (stars == 1 || stars == 2 * i - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    //         1
    //       2 2 2
    //     3 3 3 3 3
    //   4 4 4 4 4 4 4
    // 5 5 5 5 5 5 5 5 5
    public static void pattern25(int n){
        System.out.println("Using While Loop : ");
        int space = n - 1;
        int star = 1;
        int row = 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print(row + " "); // * -> row
                j++;
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }
    }

    //                 1
    //             2   3   4
    //         5   6   7   8   9
    //     10  11  12  13  14  15  16
    // 17  18  19  20  21  22  23  24  25
    public static void pattern26(int n){
        System.out.println("Using While Loop : ");
        int space = n - 1;
        int star = 1;
        int row = 1;
        int num = 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print(num + " ");
                num++;
                j++;
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }
    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public static void pattern27(int n){
        System.out.println("Using For Loop : ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //         1
    //       1 2 3
    //     1 2 3 4 5
    //   1 2 3 4 5 6 7
    // 1 2 3 4 5 6 7 8 9
    public static void pattern28(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<n-i+1; j++){
                System.out.print("  ");
            }
            //number
            for(int k=1; k<=2*i-1; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    //         1
    //       1 2 1
    //     1 2 3 2 1
    //   1 2 3 4 3 2 1
    // 1 2 3 4 5 4 3 2 1
    public static void pattern29(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //numbers
            for(int k=1; k<=i; k++){
                System.out.print(k + " ");
            }
            // numbers
            for (int k = i-1; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    

    //         1
    //       2 3 2
    //     3 4 5 4 3
    //   4 5 6 7 6 5 4
    // 5 6 7 8 9 8 7 6 5
    public static void pattern30(int n) {
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            //number
            for(int k=i; k<=2*i-1; k++){
                System.out.print(k + " ");               
            }
            //number
            for(int k=2*i-2; k>=i; k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    //         1
    //       2 0 2
    //     3 0 0 0 3
    //   4 0 0 0 0 0 4
    // 5 0 0 0 0 0 0 0 5
    public static void pattern31(int n) {
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            //number
            for(int k=1; k<=2*i-1; k++){
                if(k==1 || k==2*i-1){
                    System.out.print(i + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // 5 4 3 2 1
    // 5 4 3 2 1
    // 5 4 3 2 1
    // 5 4 3 2 1
    // 5 4 3 2 1
    public static void pattern32(int n){
        for(int i=1; i<=n; i++){
            for(int j=5; j>=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 5 4 3 2 *
    // 5 4 3 * 1
    // 5 4 * 2 1
    // 5 * 3 2 1
    // * 4 3 2 1
    public static void pattern33(int n){
        System.out.println("Using For Loop : ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i+j == 6){
                    System.out.print(" * ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

//                   0
//                 9 0 9
//               8 9 0 9 8
//             7 8 9 0 9 8 7
//           6 7 8 9 0 9 8 7 6
//         5 6 7 8 9 0 9 8 7 6 5
//       4 5 6 7 8 9 0 9 8 7 6 5 4
//     3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
//   2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
// 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1
public static void pattern34(int n){}

// 1 
// 2 * 2 
// 3 * 3 * 3 
// 4 * 4 * 4 * 4 
// 5 * 5 * 5 * 5 * 5 
// 4 * 4 * 4 * 4 
// 3 * 3 * 3 
// 2 * 2 
// 1
public static void pattern35(int n){}

    // *       * * * * *
    // *       *
    // *       *
    // *       *
    // * * * * * * * * *
    //         *       *
    //         *       *
    //         *       *
    // * * * * *       *
    public static void pattern36(){}

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
        // pattern11(n);
        // pattern12(n);
        // pattern13(n);
        // pattern14(n);
        pattern15(n);
        // pattern16(n);
        // pattern17(n);
        // pattern18(n);
        // pattern19(n);
        // pattern20(n);
        // pattern21(n);
        // pattern22(n);
        // pattern23(n);
        // pattern24(n);
        // pattern25(n);
        // pattern26(n);
        // pattern27(n);
        // pattern28(n);
        // pattern29(n);
        // pattern30(n);
        // pattern31(n);
        // pattern32(n);
        // pattern33(n);
        // pattern34(n);
        // pattern35(n);
        // pattern36();
        sc.close();
    }
}
