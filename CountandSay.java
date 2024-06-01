public class CountandSay {
    public String countAndSay(int n) {
        String result = "1";
        for (int i = 0; i < n - 1; i++) {
            result = countNum(result);
        }
        return result;
    }

    private String countNum(String num) {
        StringBuilder result = new StringBuilder();
        char currChar = num.charAt(0);
        int reps = 1;

        for (int i = 1; i < num.length(); i++) {
            if (currChar != num.charAt(i)) {
                result.append(reps);
                result.append(currChar);

                currChar = num.charAt(i);
                reps = 1;
            } else {
                reps++;
            }
        }
        result.append(reps);
        result.append(currChar);
        return result.toString();
    }
}
