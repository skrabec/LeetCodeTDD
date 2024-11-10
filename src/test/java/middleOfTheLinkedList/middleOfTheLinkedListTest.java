package middleOfTheLinkedList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class middleOfTheLinkedListTest {
    MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

    private static Stream<Arguments> testCases() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new ListNode(1,(new ListNode(2))), 1));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void checkMiddleOfTheLinkedList(ListNode listNode, int expectedResult){
        assertThat(middleOfTheLinkedList.middleNode(listNode), equalTo(expectedResult));
    }
}