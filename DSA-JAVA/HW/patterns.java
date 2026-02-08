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
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        pattern5();
    }
}
