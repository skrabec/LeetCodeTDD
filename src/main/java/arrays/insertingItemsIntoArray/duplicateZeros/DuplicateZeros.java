package arrays.insertingItemsIntoArray.duplicateZeros;

public class DuplicateZeros {
    public int[] duplicateZeros(int[] arr) {
        int duplicates = 0;
        int length_ = arr.length - 1;

        for (int i = 0; i <= length_ - duplicates; i++) {
            if (arr[i] == 0) {
                if (i == length_ - duplicates) {
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                duplicates++;
            }
        }

        int last = length_ - duplicates;

        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + duplicates] = 0;
                duplicates--;
                arr[i + duplicates] = 0;
            } else {
                arr[i + duplicates] = arr[i];
            }
        }

        return arr;

    }
}
