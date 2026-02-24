package Leetcode.Easy;

public class Leet_724 {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int n : nums)
            totalSum += n;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Leet_724 solution = new Leet_724();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int pivotIndex = solution.pivotIndex(nums);
        System.out.println("Pivot Index: " + pivotIndex);
    }
}
