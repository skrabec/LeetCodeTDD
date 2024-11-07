package richestCustomerWealthTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import richestCustomerWealth.RichestCustomerWealth;
import java.util.stream.Stream;

class RichestCustomerWealthTest {
    RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();

    private static Stream<Arguments> testCases() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[][]{{1},{5}}, 5),
            org.junit.jupiter.params.provider.Arguments.of(new int[][]{{3},{6}}, 6),
            org.junit.jupiter.params.provider.Arguments.of(new int[][]{{3, 1}, {6, 5}}, 11),
            org.junit.jupiter.params.provider.Arguments.of(new int[][]{{1,2,3}, {1,2,3}}, 6),
            org.junit.jupiter.params.provider.Arguments.of(new int[][]{{1,5}, {7,3}, {3,5}}, 10),
            org.junit.jupiter.params.provider.Arguments.of(new int[][]{{95},{95},{64},{96},{100},{74},{44},{100},{97},{99},{45},{98},{34},{16},{39},{81},{38},{46},{73},{12},{72},{91},{20},{63},{58},{40},{72},{97},{49},{3},{37},{71},{67},{38},{39},{20},{71},{90},{6},{31},{20},{4}}, 100));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void findTheReachestTest(int[][] accounts, int expectedResult) {
        assertThat(richestCustomerWealth.maximumWealth(accounts), equalTo(expectedResult));
    }

}