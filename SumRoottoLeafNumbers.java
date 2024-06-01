public class SumRoottoLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return getValue(root, 0);
    }

    private int getValue(TreeNode node, int value) {
        if (node == null) {
            return 0;
        }
        value = (value * 10) + node.val;

        if (node.left == null && node.right == null) {
            return value;
        }

        return getValue(node.left, value) + getValue(node.right, value);
    }
}
