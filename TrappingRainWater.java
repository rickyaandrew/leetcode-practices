public class TrappingRainWater {
    public int trap(int[] height) {
        int length = height.length;
        int result = 0;
        if (length == 0) {
            return 0;
        }
        int[] leftSide = new int[length];
        int[] rightSide = new int[length];

        leftSide[0] = height[0];
        for (int i = 1; i < length; i++) {
            leftSide[i] = Math.max(leftSide[i - 1], height[i]);
        }

        rightSide[length - 1] = height[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightSide[i] = Math.max(rightSide[i + 1], height[i]);
        }

        for (int i = 0; i < length; i++) {
            result += Math.min(leftSide[i], rightSide[i]) - height[i];
        }

        return result;
    }
}
