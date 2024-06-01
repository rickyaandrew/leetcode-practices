public class ClimbStairs {
    public int climbStairs(int n) {
        int steps = 0;
        int val1 = 0;
        int val2 = 1;
            for (int i = 1; i <= n; i++){
                steps = val1 + val2;
                val1 = val2;
                val2 = steps;
            }
        return steps;
    }
}
