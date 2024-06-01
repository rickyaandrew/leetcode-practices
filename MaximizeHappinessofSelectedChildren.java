import java.util.Arrays;

public class MaximizeHappinessofSelectedChildren {
    public long maximumHappinessSum(int[] happiness, int k) {
        int round = 0;
        long res = 0;
        Arrays.sort(happiness);
        reverseArray(happiness);
        while (k > 0) {
            if (happiness[round] > round) {
                res += happiness[round] - round;
            }
            round++;
            k--;
        }
        return res;
    }

    private void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (i == arr.length - 1 - i) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
