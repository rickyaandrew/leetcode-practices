public class SmallestStringStartingFromLeaf {
    public String smallestFromLeaf(TreeNode root) {
        return getValue(root, new StringBuilder()).toString();
    }

    private StringBuilder getValue(TreeNode node, StringBuilder builder) {
        if (node == null) {
            return builder;
        }
        builder.append((char) ('a' + node.val));

        if (node.left == null && node.right == null) {
            return builder.reverse();
        }

        StringBuilder builderLeft = node.left != null ? getValue(node.left, new StringBuilder(builder)) : null;
        StringBuilder builderRight = node.right != null ? getValue(node.right, new StringBuilder(builder)) : null;

        if (builderLeft != null && builderRight != null) {
            return builderLeft.toString().compareTo(builderRight.toString()) < 0 ? builderLeft : builderRight;
        } else {
            return builderLeft == null ? builderRight : builderLeft;
        }
    }
}
