public class HappyNumber {
    public boolean isHappy(int n) {
        int currValue = n;
        int newValue = 0;

        if (n < 7) {
            return false;
        }

        while (currValue > 0) {
            newValue += ((currValue % 10) * (currValue % 10));
            currValue /= 10;
        }
        
        if (newValue == 1) {
            return true;
        } else {
            return isHappy(newValue);
        }
    }

}
