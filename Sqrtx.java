public class Sqrtx {
    public int mySqrt(int n) {
        long low = 0;
        long high = n;
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid < n) {
                low = mid + 1;
                result = mid;
            } else if (mid * mid > n) {
                high = mid - 1;
            } else {
                return (int) mid;
            }
        }
        return (int) result;
    }
    
}
