public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums, 0, nums.length - 1 - k);
        reverseArray(nums, nums.length - k, nums.length - 1);
        reverseArray(nums, 0, nums.length - 1);
    }

    private int[] reverseArray(int[] arr, int start, int end) {
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
