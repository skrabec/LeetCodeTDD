package mergeSortedArray;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import arrays.insertingItemsIntoArray.mergeSortedArray.MergeSortedArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    private static Stream<Arguments> testCases() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,2,3,0,0,0}, new int[]{2,5,6}, 3, 3, new int []{1,2,2,3,5,6})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void mergeSortedArrayTests (int [] nums1, int [] nums2, int m, int n, int [] expected) {
        assertThat(mergeSortedArray.merge(nums1, m, nums2, n), equalTo(expected));
    }

}
