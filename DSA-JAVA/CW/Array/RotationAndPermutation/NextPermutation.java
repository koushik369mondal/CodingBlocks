package CW.Array.RotationAndPermutation;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        NextPermutation solver = new NextPermutation();

        // Test case
        int[] nums = { 1, 2, 3 };
        solver.nextPermutation(nums);

        // Print output to terminal
        System.out.println(Arrays.toString(nums)); // Expected: [1, 3, 2]
    }

    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;

        // Step 1: Find the break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        // Step 2: If no break point, reverse the whole array
        if (idx == -1) {
            rev(nums, 0, n - 1);
            return;
        }

        // Step 3: Find next greater element and swap with nums[idx]
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        // Step 4: Reverse the remaining elements
        rev(nums, idx + 1, n - 1);
    }

    // Helper method to reverse array segment
    private void rev(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}