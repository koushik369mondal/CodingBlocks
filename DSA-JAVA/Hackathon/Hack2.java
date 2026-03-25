package Hackathon;

import java.util.*;

public class Hack2 {
    public static void main(String[] args) {
        
    }

    
    // cookies problem
    public static void cookiesProblem() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cookies = new int[n];
        int[] children = new int[m];
        for (int i = 0; i < n; i++) {
            children[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            cookies[i] = sc.nextInt();
        }
        Arrays.sort(cookies);
        Arrays.sort(children);
        int count = 0;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (cookies[i] >= children[j]) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println(count);
        sc.close();
    }

    // find missing element in an array
    // input: 7
    // 1 3 2 3 2 4 7
    // output: 5 6
    public static void missingNumber(){
        
    }

    // Monotonous array

    // rotate

}
