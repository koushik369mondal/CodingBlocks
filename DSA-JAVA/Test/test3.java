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
    public static void trappingRainWater(){
        int height[] = {4,2,0,3,2,5};
        int n = height.length;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        // left max
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        // right max
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        System.out.println(trappedWater);
    }                                                                               

    // duplicate number in an array
    public static boolean duplicateNumber(){
        int arr[] = {1, 2, 2, 3, 4};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }

    // move all zeroes to end of array (eg. 1,0,1,1,0,1,0,1,0 -> 1,1,1,1,1,0,0,0,0)
    public static void moveZeroes(){
        int arr[] = {1,0,1,1,0,1,0,1,0};
        int n = arr.length;
        int count = 0; // count of non-zero elements
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        while(count < n){
            arr[count] = 0;
            count++;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

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
        // missingNumber();
        // trappingRainWater();
        // System.out.println(duplicateNumber());
        moveZeroes();
    }
}
