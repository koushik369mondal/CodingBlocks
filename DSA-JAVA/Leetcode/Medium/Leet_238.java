// 238. Product of Array Except Self
package Leetcode.Medium;
import java.util.Arrays;
public class Leet_238 {

    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        // Left Product
        result[0]=1;
        for(int i=1; i<n; i++){
            result[i] = result[i-1] * nums[i-1];
        }
        // Right Product
        int right = 1;
        for(int i=n-1; i>=0; i--){
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Leet_238 leet = new Leet_238();
        int[] res = leet.productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }
}
