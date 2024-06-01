public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return doRecursive(nums, 0, nums.length - 1);
    }

    private TreeNode doRecursive(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode currNode = new TreeNode(nums[mid]);
        currNode.left = doRecursive(nums, left, mid - 1);
        currNode.right = doRecursive(nums, mid + 1, right);

        return currNode;
    }
}
