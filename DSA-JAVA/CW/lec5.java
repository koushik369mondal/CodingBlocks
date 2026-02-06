import java.util.Scanner;

public class lec5 {
    public static void pattern1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }
    }

    public static void pattern2() {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int space = 0;
        int star = 2 * n - 1;
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
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row++;
            space++;
            star = star - 2;
        }
    }

    public static void pattern3(){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
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
                if (j % 2 == 1) {
                    System.out.print("* ");
                    j++;
                } else {
                    System.out.print("  ");
                    j++;
                }
            }
            System.out.println();
            row++;
            space--;
            star += 2;
        }
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        pattern3();
    }
}