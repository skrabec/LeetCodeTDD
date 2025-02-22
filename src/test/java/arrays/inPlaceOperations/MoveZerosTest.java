package arrays.inPlaceOperations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class MoveZerosTest {

    MoveZeros moveZeroesToTheEnd = new MoveZeros();

    private static Stream<Arguments> testCases () {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{0,1,0,3,12}, new int[]{1,3,12,0,0}));
    }


    @ParameterizedTest
    @MethodSource("testCases")
    void moveZeroes(int [] nums, int [] expected) {
        assertThat(moveZeroesToTheEnd.moveZeroes(nums), equalTo(expected));
    }
}