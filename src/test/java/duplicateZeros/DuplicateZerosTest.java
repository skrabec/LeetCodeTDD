package duplicateZeros;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import arrays.insertingItemsIntoArray.duplicateZeros.DuplicateZeros;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class DuplicateZerosTest {

    DuplicateZeros duplicateZeros = new DuplicateZeros();

    private static Stream<Arguments> testCases () {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1}, new int[]{1}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,0,2,3,0,4,5,0}, new int[]{1,0,0,2,3,0,0,4}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,0,2}, new int[]{1,0,0}),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{0,0,0}, new int[]{0,0,0})
        );
    }


    @ParameterizedTest
    @MethodSource("testCases")
    public void duplicateZerosTests(int [] nums, int [] expected){
        assertThat(duplicateZeros.duplicateZeros(nums), equalTo(expected));

    }

}