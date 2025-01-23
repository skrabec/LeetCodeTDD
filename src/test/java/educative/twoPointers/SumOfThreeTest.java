package educative.twoPointers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class SumOfThreeTest {

    SumOfThree findSumOfThreeTest = new SumOfThree();

    private static Stream<Arguments> testCases () {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{3,7,1,2,8,4,5}, 10));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void checkSumOfThreeTest(int [] nums, int target){
        assertThat(findSumOfThreeTest.findSumOfThree(nums, target), equalTo(true));
    }
}