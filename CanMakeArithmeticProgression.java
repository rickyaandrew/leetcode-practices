public class CanMakeArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        sort(arr);
        int arrDiff = arr[1] - arr[0];
        System.out.println(arrDiff);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                continue;
            }
            if (arr[i + 1] - arr[i] != arrDiff) {
                return false;
            }
        }
        return true;
    }

    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
