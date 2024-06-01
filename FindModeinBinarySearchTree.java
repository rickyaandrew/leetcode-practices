import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindModeinBinarySearchTree {
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        search(root, map);
        int highestVal = 0;

        for (int key : map.keySet()) {
            highestVal = Math.max(highestVal, map.get(key));
        }

        List<Integer> ans = new ArrayList<>();
        for (int val : map.keySet()) {
            if (map.get(val) == highestVal) {
                ans.add(val);
            }
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    private void search(TreeNode node, HashMap<Integer, Integer> map) {
        if (node == null) {
            return;
        }

        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        search(node.left, map);
        search(node.right, map);
        return;
    }
}
