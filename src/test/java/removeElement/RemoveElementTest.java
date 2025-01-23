package removeElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import arrays.deletingItemsIntoAnArray.removeElement.RemoveElement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class RemoveElementTest {

    RemoveElement removeElement = new RemoveElement();

    private static Stream<Arguments> testCases(){
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{3,2,2,3}, 3, 2),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{0,1,2,2,3,0,4,2}, 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void removeElementTest(int [] nums, int val, int expected) {
        assertThat(removeElement.removeElement(nums, val), equalTo(expected));
    }
}