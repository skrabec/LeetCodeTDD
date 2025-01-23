package arrays.arraysIntroduction.findNumbersWithEvenNumberOfDigits;

public class FindNumberWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int counter = 0;
        int value;
        int counterOfEvens = 0;
        for (int num : nums) {
            value = num;
            while (value > 9) {
                counter++;
                value = value / 10;
            }
            if (counter % 2 != 0) {
                counterOfEvens++;
                counter = 0;
            }
        }

        return counterOfEvens;
    }
}
