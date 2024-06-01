public class Rakuten {
    public void solution(int N) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N - 1; i++) {
            System.out.println("L");
        }
        for (int i = 0; i < N; i++) {
            stringBuilder.append("L");
        }
        System.out.println(stringBuilder.toString());
    }

    public int solution(int[] A) {
        long binSum = 0;

        for (int num : A) {
            binSum += (1L << num);
        }

        int count = 0;

        while (binSum > 0) {
            if ((binSum & 1) == 1) {
                count++;
            }
            binSum >>= 1;
        }
        return count;
    }
}
