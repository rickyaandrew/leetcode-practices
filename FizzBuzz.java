import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                builder.append("Fizz");
            }
            if (i % 5 == 0) {
                builder.append("Buzz");
            }
            if (builder.length() == 0) {
                builder.append(i);
            }
            result.add(builder.toString());
            builder.delete(0, builder.length());
        }
        return result;
    }
}
