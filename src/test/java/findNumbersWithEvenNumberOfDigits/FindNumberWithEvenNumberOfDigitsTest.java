package findNumbersWithEvenNumberOfDigits;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import arrays.arraysIntroduction.findNumbersWithEvenNumberOfDigits.FindNumberWithEvenNumberOfDigits;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class FindNumberWithEvenNumberOfDigitsTest {

    FindNumberWithEvenNumberOfDigits findNumberWithEvenNumberOfDigits = new FindNumberWithEvenNumberOfDigits();

    private static Stream<Arguments> testCases () {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{0}, 0),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{12}, 1),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{112}, 0),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{12, 112}, 1),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{12, 112}, 1),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{12,345,2,6,7896}, 2),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{555,901,482,1771}, 1)


        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void findNumberWithEvenNumberOfDigitsTest(int [] nums, int expected){
        assertThat(findNumberWithEvenNumberOfDigits.findNumbers(nums), equalTo(expected));
    }
}