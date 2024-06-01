public class ConstructStringfromBinaryTree {
    public String tree2str(TreeNode root) {
        String leftResult = "";
        String rightResult = "";

        if (root.left == null && root.right == null) {
            return Integer.toString(root.val);
        }
        if (root.left != null) {
            leftResult = leftResult + tree2str(root.left);
        }
        if (root.right != null) {
            rightResult = rightResult + tree2str(root.right);
        }
        if (rightResult.equals("")) {
            return String.format("%d(%s)", root.val, leftResult);
        }
        if (leftResult.equals("")) {
            return String.format("%d(()(%s))", root.val, rightResult);
        }
        return String.format("%d((%s)(%s))", root.val, leftResult, rightResult);
    }
}
