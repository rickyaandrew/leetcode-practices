import java.util.LinkedList;
import java.util.Queue;

public class FindtheWinneroftheCircularGame {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.poll();
    }

    public int solution2(int n, int k) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = (result + k) % i;
        }
        return result + 1;
    }
}
