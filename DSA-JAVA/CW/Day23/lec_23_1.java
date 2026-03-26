// 26th March 2026
package CW.Day23;
import java.util.Scanner;
public class lec_23_1 {
    public static void main(String[] args) {
        twoFriend();
    }

    

    public static void twoFriend(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int A = 0;
        int B = 0;
        int i = 0, j = n - 1;
        char turn = 'A';
        while (i <= j) {
            if (turn == 'A') {
                if (arr[i] <= arr[j]) {
                    A += arr[j];
                    j--;
                } else {
                    A += arr[i];
                    i++;
                }
                turn = 'B';
            } else {
                if (arr[i] <= arr[j]) {
                    B += arr[j];
                    j--;
                } else {
                    B += arr[i];
                    i++;
                }
                turn = 'A';
            }
        }
        if (A >= B) {
            System.out.println("A : " + A);
        } else {
            System.out.println("B : " + B);
        }
        sc.close();
    }
}
