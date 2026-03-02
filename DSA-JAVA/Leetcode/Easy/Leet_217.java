package Leetcode.Easy;

public class Leet_217 {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
            Leet_217 obj = new Leet_217();
            int nums[] = {1,2,3,1};
            System.out.println(obj.containsDuplicate(nums));
    }
}
