package arrays.inPlaceOperations;

public class MoveZeros {
    public int[] moveZeroes(int[] nums) {
        int firstPointer = 0;
        int secondPointer = 0;

       while (secondPointer < nums.length) {
            if (nums[firstPointer] != 0) {
                firstPointer++;
                secondPointer++;
            } else if (nums[secondPointer] == 0) {
                secondPointer++;
            } else {
                int temp = nums[secondPointer];
                nums[secondPointer] = nums[firstPointer];
                nums[firstPointer] = temp;
            }
        }
        return nums;
    }
}
