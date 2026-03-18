package ClassTest;

import java.util.Scanner;

public class test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int target = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print(arr[i] + "," + arr[j]);
                    return;
                }
            }
        }
    }
}