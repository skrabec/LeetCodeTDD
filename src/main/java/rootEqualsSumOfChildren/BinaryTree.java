package rootEqualsSumOfChildren;

public class BinaryTree {
    public boolean checkTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return false;
        }

        int leftValue = (!(root.left == null)) ? root.left.val : 0;
        int rightValue = (!(root.right == null)) ? root.right.val : 0;

        return root.val == leftValue + rightValue;

    }
}
