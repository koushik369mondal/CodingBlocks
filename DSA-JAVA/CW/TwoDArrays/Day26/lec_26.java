// 1st April 2026
package CW.TwoDArrays.Day26;

import java.util.Scanner;

public class lec_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        SpiralMatrix(arr);
        sc.close();
    }

    // Spiral Matrix
    public static void SpiralMatrix(int arr[][]){
        int SR=0;
        int SC=0;
        int ER=arr.length-1;
        int EC=arr[0].length-1;

        while(SR<=ER && SC<=EC){
            // top
            for(int j=SC; j<=EC; j++){
                System.out.print(arr[SR][j] + " ");
            }
            // right
            for(int i=SR+1; i<=ER; i++){
                System.out.print(arr[i][EC] + " ");
            }
            // bottom
            for(int j=EC-1; j>=SC; j--){
                System.out.print(arr[ER][j] + " ");
            }
            // left
            for(int i=ER-1; i>=SR+1; i--){
                System.out.print(arr[i][SC] + " ");
            }
            SR++;
            SC++;
            ER--;
            EC--;
        }
    }
}
