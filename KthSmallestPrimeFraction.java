import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestPrimeFraction {
    // public int[] kthSmallestPrimeFraction(int[] arr, int k) {
    // PriorityQueue<int[]> pQueue = new
    // PriorityQueue<>(Comparator.comparingDouble(a -> (double) a[0] / a[1]));
    // int n = arr.length;

    // for (int i = 0; i < n; i++) {
    // for (int j = 1; j < n; j++) {
    // pQueue.add(new int[] { arr[i], arr[j] });
    // }
    // }

    // int[] result = new int[2];
    // for (int i = 0; i < k; i++) {
    // result = pQueue.poll();
    // }

    // return result;
    // }

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double left = 0, right = 1, mid;
        int[] res = new int[2];

        while (left <= right) {
            mid = left + (right - left) / 2;
            int j = 1, total = 0, num = 0, den = 0;
            double maxFrac = 0;
            for (int i = 0; i < n; ++i) {
                while (j < n && arr[i] >= arr[j] * mid) {
                    ++j;
                }

                total += n - j;

                if (j < n && maxFrac < arr[i] * 1.0 / arr[j]) {
                    maxFrac = arr[i] * 1.0 / arr[j];
                    num = i;
                    den = j;
                }
            }

            if (total == k) {
                res[0] = arr[num];
                res[1] = arr[den];
                break;
            }

            if (total > k) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return res;
    }

}
