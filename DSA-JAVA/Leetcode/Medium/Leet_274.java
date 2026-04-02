package Leetcode.Medium;

import java.util.Arrays;

public class Leet_274 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        for(int i=0; i<n; i++){
            int papers = n-i;
            if(citations[i] >= papers){
                return papers;             
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Leet_274 solution = new Leet_274();
        int[] citations1 = {3, 0, 6, 1, 5};
        System.out.println(solution.hIndex(citations1)); // Output: 3

        int[] citations2 = {1, 3, 1};
        System.out.println(solution.hIndex(citations2)); // Output: 1
    }
}
