package richestCustomerWealth;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        int tempResult;

        for (int[] account : accounts) {
            tempResult = 0;
            for (int i : account) {
                tempResult += i;
            }
            if (tempResult >= result) {
                result = tempResult;
            }
        }
        return result;
    }
}
