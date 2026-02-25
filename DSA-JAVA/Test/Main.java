package Test;

public class Main {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            } else {
                prod *= nums[i];
            }
        }

        if (countZero == nums.length) {
            return nums;
        } else if (countZero > 1) {
            return new int[nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            if (countZero > 0) {
                if (nums[i] != 0) {
                    nums[i] = 0;
                } else {
                    nums[i] = prod;
                }
            } else {
                nums[i] = prod / nums[i];
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {1, 2, 3, 4};
        int[] res = main.productExceptSelf(nums);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
