import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        for (int i = 1; i <= size; i++) {
            int counter = 0;
            while (nums[counter] < i && counter < size) {
                counter++;
            }
            if ((size - counter) == i) {
                return i;
            }
        }
        return -1;
    }
}
