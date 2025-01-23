package arrays.searchingForItemsInAnArray;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int firstPointer = 0;
        int lastPointer = arr.length-1;

        if (arr.length < 3) {
            return false;
        }

        while (firstPointer < lastPointer) {
            if (arr[firstPointer+1] > arr[firstPointer]) {
                firstPointer++;
            } else if (arr[lastPointer-1] > arr[lastPointer]) {
                lastPointer--;
            } else {
                break;
            }
        }
        return firstPointer != 0 && lastPointer != arr.length -1 && firstPointer == lastPointer;
    }
}
