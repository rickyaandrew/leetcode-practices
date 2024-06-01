public class BinarySearch {
    public int search(int[] nums, int target) {
        int highIndex = nums.length - 1;
        int lowIndex = 0;
        int midIndex = -1;
        int midValue = -1;

        while (highIndex - lowIndex > 0) {
            midIndex = (highIndex + lowIndex) / 2;
            midValue = nums[midIndex];

            if (midValue == target) {
                return midIndex;
            }

            if (midValue > target) {
                highIndex = midIndex - 1;
                continue;
            }

            if (midValue < target) {
                lowIndex = midIndex + 1;
                continue;
            }
        }
        if (nums[lowIndex] == target) {
            return lowIndex;
        } else {
            return -1;
        }
    }
}
