import java.util.Arrays;

public class BoatstoSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int high = people.length - 1;
        int low = 0;
        int result = 0;

        Arrays.sort(people);

        while (low < high) {
            int currHigh = people[high];
            int currLow = people[low];

            if (currHigh + currLow <= limit) {
                low++;
                high--;
                result++;
            } else {
                high--;
                result++;
            }
        }
        if (low == high) {
            result++;
        }
        return result;
    }
}
