package arrays.searchingForItemsInAnArray;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class CheckIfNandItsDoubleExistTest {
    CheckIfNandItsDoubleExist checkIfNandItsDoubleExist = new CheckIfNandItsDoubleExist();

    private static Stream<Arguments> testCases() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{10, 2, 5, 3}, true),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{3, 1, 7, 11}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void checkIfNandItsDoubleExistTest(int[] nums, boolean expected) {
        assertThat(checkIfNandItsDoubleExist.checkIfExist(nums), equalTo(expected));

    }

}