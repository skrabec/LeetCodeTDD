package runningSumOf1DArray;

public class RunningSumOf2DArray {
    public int[] runningSum(int[] nums) {
            for (int i = 1; i< nums.length; i++){
                nums[i] += nums[i-1] ;
        }
        return nums;
    }
}
