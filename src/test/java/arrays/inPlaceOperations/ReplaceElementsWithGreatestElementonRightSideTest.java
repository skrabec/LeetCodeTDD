package arrays.inPlaceOperations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class ReplaceElementsWithGreatestElementonRightSideTest {

    ReplaceElementsWithGreatestElementonRightSide replaceElementsWithGreatestElementonRightSide = new ReplaceElementsWithGreatestElementonRightSide();

    private static Stream<Arguments> testCases () {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1}, new int[]{-1}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1, 1}, new int[]{1, -1}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1, 1, 1}, new int[]{1, 1, -1}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1, 2, 1}, new int[]{2, 1, -1}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{17,18,5,4,6,1}, new int[]{18,6,6,6,1,-1})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void replaceElements(int [] arr, int [] expected) {
        assertThat(replaceElementsWithGreatestElementonRightSide.replaceElements(arr), equalTo(expected));
    }
}