package findMaxConsecutiveOnes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import arrays.arraysIntroduction.findMaxConsecutiveOnes.FindMaxConsecutiveOnes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class FindMaxConsecutiveOnesTest {

    FindMaxConsecutiveOnes findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();

    private static Stream<Arguments> testCases () {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{0}, 0),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1}, 1),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,1}, 2),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,0}, 1),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{0,0}, 0),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,1,0}, 2),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,1,0,1}, 2),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,1,0,1,1}, 2),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,1,0,1,1,1}, 3),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,0,1,1,0,1}, 2)


        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void findMaxConsecutiveOnesTest(int [] sums, int expected){
        assertThat(findMaxConsecutiveOnes.findMaxConsecutiveOnes(sums), equalTo(expected));

    }

}