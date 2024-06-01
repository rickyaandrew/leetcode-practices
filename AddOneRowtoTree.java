public class AddOneRowtoTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }
        addRow(root, val, depth - 2);
        return root;
    }

    private void addRow(TreeNode node, int val, int depth) {
        if (depth > 0) {
            if (node.left != null) {
                addRow(node.left, val, depth - 1);
            }
            if (node.right != null) {
                addRow(node.right, val, depth - 1);
            }
            return;
        }
        if (node.left != null) {
            TreeNode lTemp = node.left;
            node.left = new TreeNode(val);
            node.left.left = lTemp;
        } else {
            node.left = new TreeNode(val);
        }
        if (node.right != null) {
            TreeNode rTemp = node.right;
            node.right = new TreeNode(val);
            node.right.right = rTemp;
        } else {
            node.right = new TreeNode(val);
        }
    }
}
