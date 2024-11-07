package rootEqualsSumOfChildren;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class BinaryTreeTest {
    BinaryTree binaryTree = new BinaryTree();

    private static Stream<org.junit.jupiter.params.provider.Arguments> testCases () {
        return Stream.of(
        org.junit.jupiter.params.provider.Arguments.of(new TreeNode(10, new TreeNode(5), new TreeNode(5)), true),
        org.junit.jupiter.params.provider.Arguments.of(new TreeNode(10, new TreeNode(5), new TreeNode(6)), false),
            org.junit.jupiter.params.provider.Arguments.of(new TreeNode(10, null, new TreeNode(6)), false));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void checkTreeTest(TreeNode root, boolean expectedResult) {
        assertThat(binaryTree.checkTree(root), is(expectedResult));
    }
}