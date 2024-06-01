public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1Arr = version1.split("\\.");
        String[] v2Arr = version2.split("\\.");

        int length = 0;

        if (v1Arr.length <= v2Arr.length) {
            length = v2Arr.length;
        } else {
            length = v1Arr.length;
        }


        for (int i = 0; i < length; i++) {
            int currV1 = 0;
            int currV2 = 0;
            if (v1Arr.length > i) {
                currV1 = Integer.parseInt(v1Arr[i]);
            }
            if (v2Arr.length > i) {
                currV2 = Integer.parseInt(v2Arr[i]);
            }

            if (currV1 < currV2) {
                return -1;
            }
            if (currV1 > currV2) {
                return 1;
            }
        }

        return 0;
    }
}
