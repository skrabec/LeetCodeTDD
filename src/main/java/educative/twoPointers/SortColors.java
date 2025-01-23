package educative.twoPointers;

public class SortColors {
        public int[] sortColors (int[] colors) {
            int start = 0;
            int current = 0;
            int end = colors.length-1;

            while (current <= end) {
                if (colors[current] == 0) {
                    int temp = colors[start];
                    colors[start] = colors[current];
                    colors[current] = temp;
                    start++;
                    current++;
                } else if (colors[current] == 1) {
                    current++;
                } else {
                    int temp = colors[end];
                    colors[end] = colors[current];
                    colors[current] = temp;
                    end--;
                }
            }

            return colors;
        }

}
