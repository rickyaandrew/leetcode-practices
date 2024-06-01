import java.util.Arrays;

public class CodalityTest {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[A.length - 1] <= 0) {
            return 1;
        }
        int curr = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == curr) {
                curr++;
            }
        }
        return curr;
    }
}
