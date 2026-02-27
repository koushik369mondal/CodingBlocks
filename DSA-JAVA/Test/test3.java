package Test;

public class test3 {
    // Find missing number in an array
    public static void missingNumber(){
        int arr[] = {3, 0, 1};
        int n = arr.length;
        int sum1 = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0; i<n; i++){
            sum2 = sum2 + arr[i];
        }
        System.out.println(sum1 - sum2);
    }

    // Trapping Rain Water                                                                                     

    // duplicate number in an array

    // move all zeroes to end of array

    // Insersion sort

    //       1
    //     2 3 2
    //   3 4 5 4 3
    // 4 5 6 7 6 5 4

    // * * * * * 
    //     * * * *
    //         * * * 
    //             * *
    //                 *

    public static void main(String[] args) {
        missingNumber();
    }
}
