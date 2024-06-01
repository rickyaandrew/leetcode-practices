public class NumberofStepstoReduceaNumberinBinaryRepresentationtoOne {
    public int numSteps(String s) {
        int carry = 0;
        int result = 0;
        int pointer = s.length() - 1;

        while (pointer > 0) {
            switch (s.charAt(pointer)) {
                case '0':
                    if (carry == 1) {
                        result += 2;
                        carry = 1;
                    } else {
                        result++;
                    }
                    pointer--;
                    break;
                case '1':
                    if (carry == 1) {
                        result++;
                        carry = 0;
                    } else {
                        result += 2;
                    }
                    carry = 1;
                    pointer--;
                    break;

                default:
                    break;
            }
        }

        return result + carry;
    }
}
