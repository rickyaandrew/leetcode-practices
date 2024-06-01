public class DistributeCoinsinBinaryTree {
    int result = 0;

    public int distributeCoins(TreeNode root) {
        recurse(root);
        return result;
    }

    private int recurse(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftCoins = recurse(node.left);
        int rightCoins = recurse(node.right);
        result += Math.abs(leftCoins) + Math.abs(rightCoins);
        return (node.val - 1) + leftCoins + rightCoins;
    }
}
