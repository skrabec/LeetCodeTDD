package numberOfStepsToReduceANumberToZero;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class NumberOfStepsToReduceANumberToZeroTest {
    NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();

    private static Stream<Arguments> testCases(){
        return Stream.of(
//            org.junit.jupiter.params.provider.Arguments.of(0, 0),
//            org.junit.jupiter.params.provider.Arguments.of(1, 1),
//            org.junit.jupiter.params.provider.Arguments.of(2, 2),
//            org.junit.jupiter.params.provider.Arguments.of(3, 3),
//            org.junit.jupiter.params.provider.Arguments.of(4, 3),
            org.junit.jupiter.params.provider.Arguments.of(5, 4),
            org.junit.jupiter.params.provider.Arguments.of(6, 4),
            org.junit.jupiter.params.provider.Arguments.of(14, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void numberOfStepsToReduceANumberToZeroTest(int number, int numberOfSteps){
        assertThat(numberOfStepsToReduceANumberToZero.numberOfSteps(number), equalTo(numberOfSteps));

    }

}