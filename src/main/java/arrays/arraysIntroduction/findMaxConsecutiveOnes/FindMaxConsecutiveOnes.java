package arrays.arraysIntroduction.findMaxConsecutiveOnes;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int counterTemp = 0;

        for (int num : nums) {
            if (num == 1) {
                counterTemp++;
                if (counter < counterTemp) {
                    counter = counterTemp;
                }
            } else {
                counterTemp = 0;
            }
        }

        return counter;
    }
}
