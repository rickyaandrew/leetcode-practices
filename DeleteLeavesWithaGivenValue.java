public class DeleteLeavesWithaGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        isRemoveNode(root, target);
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }

    private boolean isRemoveNode(TreeNode root, int target) {
        if (root.left != null && isRemoveNode(root.left, target)) {
            root.left = null;
        }

        if (root.right != null && isRemoveNode(root.right, target)) {
            root.right = null;
        }

        if (root.left == null && root.right == null && root.val == target) {
            return true;
        }
        return false;
    }
}
