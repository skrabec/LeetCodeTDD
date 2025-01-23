package educative.twoPointers;

import java.util.Arrays;

public class SumOfThree{
    public boolean findSumOfThree(int[] nums, int target) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length -1;

            while (low < high) {
                int currentSum = nums[i] + nums[low] + nums[high];

                if (currentSum == target) {
                    return true;
                } else if (currentSum > target){
                    high--;
                } else {
                    low++;
                }

            }
        }

        return false;
    }
}
