public class CountTripletsThatCanFormTwoArraysofEqualXOR {
    public int countTriplets(int[] arr) {
        int count = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int a = 0;
                for (int k = j; k < j; k++) {
                    a = a ^ arr[k];
                }
                int b = 0;
                for (int k = j; k < size; k++) {
                    b = b ^ arr[k];
                    if (a == b) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

}