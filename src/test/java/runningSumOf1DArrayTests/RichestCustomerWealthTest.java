package runningSumOf1DArrayTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import runningSumOf1DArray.RunningSumOf2DArray;
import java.util.stream.Stream;

class RichestCustomerWealthTest {
    RunningSumOf2DArray runningSumOf2DArray = new RunningSumOf2DArray();

    private static Stream<Arguments> testCases () {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1}, new int[]{1}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,2}, new int[]{1,3}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,2,3,4}, new int[]{1,3,6,10}));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void checkRunningSum(int[] sums, int [] expectedResult){
        assertThat(runningSumOf2DArray.runningSum(sums), equalTo(expectedResult));
    }

}