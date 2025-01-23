package arrays.insertingItemsIntoArray.mergeSortedArray;

public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int pointerToEnd = nums1.length - 1;

        while (pointer2 >= 0) {
            if (pointer1 >= 0 && nums1[pointer1] >= nums2[pointer2]){
                nums1[pointerToEnd] = nums1[pointer1];
                pointer1--;
            } else {
                nums1[pointerToEnd] = nums2[pointer2];
                pointer2--;
            }
            pointerToEnd--;
        }

        return nums1;
    }
}
