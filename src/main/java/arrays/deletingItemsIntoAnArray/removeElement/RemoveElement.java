package arrays.deletingItemsIntoAnArray.removeElement;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int reader = 0;
        int writer = 0;

        while (reader < nums.length){
            if (nums[reader] == val) {
                reader++;
            } else {
                nums[reader] = nums[writer];
                reader++;
                writer++;
            }
        }
        return writer;
    }
}
