import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumCosttoHireKWorkers {
    // public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
    // ArrayList<int[]> arrList = new ArrayList<>();
    // PriorityQueue<int[]> pq = new PriorityQueue<>(
    // (a, b) -> (a[0] / a[1]) - (b[0] / b[1]));

    // for (int i = 0; i < quality.length; i++) {
    // pq.add(new int[] { quality[i], wage[i] });
    // }
    // for (int i = 0; i < k; k++) {
    // arrList.add(pq.poll());
    // }
    // double rates = arrList.get(k - 1)[1] / arrList.get(k - 1)[0];
    // double result = 0;

    // for (int[] curr : arrList) {
    // result += curr[0] * rates;
    // }

    // return result;
    // }
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        List<Pair<Double, Integer>> ratio = new ArrayList<>();
        int n = quality.length, qualitySum = 0;
        double res = Double.MAX_VALUE, maxRate = 0.0;

        for (int i = 0; i < n; ++i) {
            ratio.add(new Pair<>((double) wage[i] / quality[i], i));
        }

        ratio.sort(Comparator.comparingDouble(p -> p.getKey()));
        for (int i = 0; i < k; ++i) {
            qualitySum += quality[ratio.get(i).getValue()];
            maxRate = Math.max(maxRate, ratio.get(i).getKey());
            maxHeap.offer(quality[ratio.get(i).getValue()]);
        }

        res = maxRate * qualitySum;
        for (int i = k; i < n; ++i) {
            maxRate = Math.max(maxRate, ratio.get(i).getKey());
            qualitySum -= maxHeap.poll();
            qualitySum += quality[ratio.get(i).getValue()];
            maxHeap.offer(quality[ratio.get(i).getValue()]);
            res = Math.min(res, maxRate * qualitySum);
        }

        return res;
    }

}
