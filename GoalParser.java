public class GoalParser {
    public String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] strArr = command.split("");

        for (int i = 0; i < strArr.length; i++) {
            String curr = strArr[i];
            switch (curr) {
                case "G":
                    stringBuilder.append("G");
                    break;

                case "(":
                    String next = strArr[i + 1];
                    if (next.equals(")")) {
                        stringBuilder = this.handleO(stringBuilder);
                        i++;
                    } else {
                        stringBuilder = this.handleAL(stringBuilder);
                        i = i + 3;
                    }
                    break;

                default:
                    break;
            }
        }
        return stringBuilder.toString();
    }

    private StringBuilder handleO(StringBuilder result) {
        return result.append("o");
    }

    private StringBuilder handleAL(StringBuilder result) {
        return result.append("al");
    }
}
