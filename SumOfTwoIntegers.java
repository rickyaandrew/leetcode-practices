public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0) {
            var carry = a & b;
            a ^= b;
            b = carry << 1;
        }
        return a;
    }

}
