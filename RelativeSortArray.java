public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int pointer = 0;
        for (int i = 0; i < arr2.length; i++) {
            int curr = arr2[i];
            for (int j = pointer; j < arr1.length; j++) {
                if (curr == arr1[j]) {
                    int temp = arr1[pointer];
                    arr1[pointer] = arr1[j];
                    arr1[j] = temp;
                    pointer++;
                }

            }
        }
        for (int i = pointer; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        return arr1;
    }
}
