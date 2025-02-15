package arrays.deletingItemsIntoAnArray.removeDuplicatesfromSortedArray;

public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }

}
