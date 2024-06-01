public class ReverseInteger {
    public int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x = x * (-1);
        }
        int reverse = 0;
        while (x > 0) {
            if (900000000 < reverse)
                return 0;
            int reminder = x % 10;
            x = x / 10;
            if (reverse == 0) {
                reverse = reminder;
            } else {
                reverse *= 10;
                reverse += reminder;
            }
            if (reverse < 0)
                return 0;
        }
        if (negative == true)
            return reverse * (-1);
        return reverse;
    }
}
