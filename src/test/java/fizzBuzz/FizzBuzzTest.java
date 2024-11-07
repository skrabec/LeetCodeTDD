package fizzBuzz;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class FizzBuzzTest {

    FizzBuzz fizzBuzzGame = new FizzBuzz();

    private static Stream<Arguments> testCases() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(0, List.of("0")),
            org.junit.jupiter.params.provider.Arguments.of(1, List.of("1")),
            org.junit.jupiter.params.provider.Arguments.of(2, Arrays.asList("1", "2")),
            org.junit.jupiter.params.provider.Arguments.of(3, Arrays.asList("1", "2", "fizz")),
            org.junit.jupiter.params.provider.Arguments.of(4, Arrays.asList("1", "2", "fizz", "4")),
            org.junit.jupiter.params.provider.Arguments.of(5, Arrays.asList("1", "2", "fizz", "4", "buzz")),
            org.junit.jupiter.params.provider.Arguments.of(6, Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz")),
            org.junit.jupiter.params.provider.Arguments.of(7, Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7")),
            org.junit.jupiter.params.provider.Arguments.of(10, Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz")),
            org.junit.jupiter.params.provider.Arguments.of(15, Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz"))

            );
           }

    @ParameterizedTest
    @MethodSource("testCases")
    public void fizzBuzzTest (int number, List<String> expected){
        assertThat(fizzBuzzGame.fizzBuzz(number), equalTo(expected));
    }

}