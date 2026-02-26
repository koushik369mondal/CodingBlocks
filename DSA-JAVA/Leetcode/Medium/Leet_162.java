package Leetcode.Medium;

public class Leet_162 {
    
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int index = 0;
        int peak = 0;
        for (int i = 0; i < n; i++) {
            if( i == 0){
                peak = nums[i];
                index = i;
            } 
            if (nums[i] > peak) {
                peak = nums[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Leet_162 obj = new Leet_162();
        int[] nums = {1, 2, 3, 1};
        int result = obj.findPeakElement(nums);
        System.out.println(result);
    }
}
