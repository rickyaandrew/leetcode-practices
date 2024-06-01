public class SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return recurse(root, 1);
    }

    private int recurse(TreeNode root, int flag) {
        if (root == null) {
            return 0;
        }
        if (flag == 0 && root.right == null && root.left == null) {
            return root.val;
        }
        return recurse(root.left, 0) + recurse(root.right, 1);
    }

}
