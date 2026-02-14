package Test;

public class test {
    public static void pattern1(int n) {

        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n ||
                        j == 1 || j == n ||
                        ((i == j || j == n - i + 1) && !(i == mid && j == mid))) {

                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
    }
    
}
