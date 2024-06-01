public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int[] currPoint;
        int[] nextPoint;
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            if (i + 1 < points.length) {
                currPoint = points[i];
                nextPoint = points[i + 1];
                res += Math.max(Math.abs(currPoint[0] - nextPoint[0]), Math.abs(currPoint[1] - nextPoint[1]));
            }
        }
        return res;
    }
}
