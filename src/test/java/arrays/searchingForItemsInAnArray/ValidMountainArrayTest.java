package arrays.searchingForItemsInAnArray;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class ValidMountainArrayTest {

    ValidMountainArray validMountainArray = new ValidMountainArray();

    private static Stream<Arguments> testCases() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{2,1}, false),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{3,5,5}, false),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{0,3,2,1}, true),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{0,1,2,3,4,5,6,7,8,9}, false)
        );
    }

    @ParameterizedTest()
    @MethodSource("testCases")
    public void validMountainArray(int [] nums, boolean expected) {
        assertThat(validMountainArray.validMountainArray(nums), equalTo(expected));
    }
}