package educative.twoPointers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class SortColorsTest {
        SortColors sortColorsTest = new SortColors();

    private static Stream<Arguments> testCases () {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{0, 0, 1, 0, 1, 1, 1, 2, 1, 2}, new int[]{0, 0, 0, 1, 1, 1, 1, 1, 2, 2}));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void checkSortColorsTest(int [] nums, int [] expected){
        assertThat(sortColorsTest.sortColors(nums), equalTo(expected));

    }

}