public class EvaluateBooleanBinaryTree {
    public boolean evaluateTree(TreeNode root) {
        if (root.val == 2 && (root.left.val == 1 || root.right.val == 1)) {
            return true;
        }
        if (root.val == 3 && (root.left.val == 0 || root.right.val == 0)) {
            return false;
        }
        return recurse(root);
    }

    private boolean recurse(TreeNode root) {
        switch (root.val) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return recurse(root.left) || recurse(root.right);
            case 3:
                return recurse(root.left) && recurse(root.right);

            default:
                break;
        }

        return false;

    }
}
