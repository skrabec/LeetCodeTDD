package removeDuplicatesfromSortedArray;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import arrays.deletingItemsIntoAnArray.removeDuplicatesfromSortedArray.RemoveDuplicatesfromSortedArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class RemoveDuplicatesfromSortedArrayTest {

    RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray = new RemoveDuplicatesfromSortedArray();

    private static Stream<Arguments> testCases(){
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,1,2}, 2),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void removeDuplicatesFromSortedArrayTest (int [] nums, int expected) {
        assertThat(removeDuplicatesfromSortedArray.removeDuplicates(nums), equalTo(expected));
    }

}