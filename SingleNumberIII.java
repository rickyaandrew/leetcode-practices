import java.util.HashSet;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int curr : nums) {
            if (set.contains(curr)) {
                set.remove(curr);
            } else {
                set.add(curr);
            }
        }
        return set.stream().mapToInt(i -> i).toArray();
    }

    public int[] singleNumber1(int[] nums) {
        int xor2no = 0;
        for (int num : nums) {
            xor2no ^= num;
        }

        int lowestBit = xor2no & (-xor2no);

        int[] result = new int[2];
        for (int num : nums) {
            if ((lowestBit & num) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }

        return result;
    }

}
