package findMaxConsecutiveOnes;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int counterTemp = 0;

        for (int i = 0; i < nums.length;i++) {
            if (nums[i]==1){
                counterTemp++;
                if (counter < counterTemp) {
                    counter = counterTemp;
                }
            } else {
                counterTemp=0;
            }
        }

        return counter;
    }
}
