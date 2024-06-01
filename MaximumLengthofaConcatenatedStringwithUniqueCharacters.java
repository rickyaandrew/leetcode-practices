import java.util.ArrayList;
import java.util.List;

public class MaximumLengthofaConcatenatedStringwithUniqueCharacters {
    private boolean checkUnique(String x)
    {
        int[] charArr=new int[26];
        
        for (char c: x.toCharArray()) {
            if (++charArr[c-'a'] > 1) {
                return false;
            }
        }
        return true;
    }

    public int maxLength(List<String> arr) {
        List<String> list = new ArrayList<String>();
        int res = 0;
        
        for (String str: arr) {
            List<String> temp = new ArrayList<>();
            if (!checkUnique(str)) {
                continue;
            }
            temp.add(str);
            res = Math.max(res, str.length());
            for (String s: list) {
                StringBuilder stringBuilder = new StringBuilder(str);
                String curr = stringBuilder.append(s).toString();

                if (checkUnique(curr)) {
                    temp.add(curr);
                    res = Math.max(res, curr.length());
                }
            }
            list.addAll(temp);
        }
        return res;
    }
}
