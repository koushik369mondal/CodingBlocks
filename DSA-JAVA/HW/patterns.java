package HW;

public class patterns {
    

    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    public static void pattern1(){
        int n = 5;

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
    public static void pattern2(){
        int n = 5;

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
    public static void pattern3(){
        int n = 5;

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
    public static void pattern4(){
        int n = 5;

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
    public static void pattern5(){
        int n = 5;

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
    public static void pattern6(){}


    // * * * * *
    // *       *
    // *       *
    // * * * * *
    public static void pattern7(){}


    //         *
    //       * * *
    //     * * * * *
    //   * * * * * * *
    // * * * * * * * * *
    public static void pattern8(){
        int n = 5;

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
    public static void pattern9(){
        int n = 5;

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
    public static void pattern10(){}


    //         *
    //       * ! *
    //     * ! * ! *
    //   * ! * ! * ! *
    // * ! * ! * ! * ! *
    public static void pattern11(){}


    // *                 *
    // * *             * *
    // * * *         * * *
    // * * * *     * * * *
    // * * * * * * * * * *
    public static void pattern12(){}


    // *               *
    // * *           * *
    // * * *       * * *
    // * * * *   * * * *
    // * * * * * * * * *
    public static void pattern13(){}


    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern14(){}


    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *
    public static void pattern15(){}


    //         * * * * *
    //       * * * *
    //     * * *
    //   * *
    // *
    //   * *
    //     * * *
    //       * * *
    //         * * * * *
    public static void pattern16(){}


    // * * * * *
    //     * * * *
    //         * * *
    //             * *
    //                 *
    //             * *
    //         * * *
    //     * * * *
    // * * * * *
    public static void pattern17(){}


    // * * * *   * * * *
    // * * *       * * *
    // * *           * *
    // *               *
    public static void pattern18(){}


    // * * * *   * * * *
    // * * *       * * *
    // * *           * *
    // *               *
    //
    // *               *
    // * *           * *
    // * * *       * * *
    // * * * *   * * * *
    public static void pattern19(){}


    //         1
    //       2 2 2
    //     3 3 3 3 3
    //   4 4 4 4 4 4 4
    // 5 5 5 5 5 5 5 5 5
    public static void pattern20(){
        int n = 5;

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
    public static void pattern21(){
        int n = 5;
        int num = 1;

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
    public static void pattern22(){
        int n = 5;

        System.out.println("Using For Loop : ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
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
    public static void pattern23(){
        int n = 5;

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

    // *       * * * * *
    // *       *
    // *       *
    // *       *
    // * * * * * * * * *
    //         *       *
    //         *       *
    //         *       *
    // * * * * *       *
    public static void pattern24(){}


    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        // pattern6();
        // pattern7();
        // pattern8();
        // pattern9();
        // pattern10();
        // pattern11();
        // pattern12();
        // pattern13();
        // pattern14();
        // pattern15();
        // pattern16();
        // pattern17();
        // pattern18();
        // pattern19();
        // pattern20();
        // pattern21();
        // pattern22();
        pattern23();
        // pattern24();
    }
}
