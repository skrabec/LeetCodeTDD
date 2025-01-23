package squaresOfASortedArray_BubbleSort;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import arrays.arraysIntroduction.squaresOfASortedArray_BubbleSort.SquaresOfASortedArray_BubbleSort;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class SquaresOfASortedArrayBubbleSortTest {

    SquaresOfASortedArray_BubbleSort squaresOfASortedArrayBubbleSort = new SquaresOfASortedArray_BubbleSort();

    private static Stream<Arguments> testCases () {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{-2}, new int[]{4}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{-2, -3}, new int[]{4, 9}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{-4,-1,0,3,2}, new int[]{0,1,4,9,16})

        );
    }


    @ParameterizedTest
    @MethodSource("testCases")
    public void SquaresOfASortedArray_BubbleSortTestCheck (int [] input, int [] expected){
        assertThat(squaresOfASortedArrayBubbleSort.sortedSquares(input), equalTo(expected));
    }

}